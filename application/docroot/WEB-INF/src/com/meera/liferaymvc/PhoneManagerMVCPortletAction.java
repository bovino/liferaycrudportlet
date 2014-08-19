package com.meera.liferaymvc;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.dbservice.model.MobilePhone;
import com.meera.dbservice.model.impl.MobilePhoneImpl;
import com.meera.dbservice.service.MobilePhoneLocalServiceUtil;

public class PhoneManagerMVCPortletAction extends MVCPortlet {
	
	public void addMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try{
		
			String name = ParamUtil.getString(actionRequest, "name");
		String brand = ParamUtil.getString(actionRequest, "brand");
		String description = ParamUtil.getString(actionRequest, "description");
		Date releaseDate = ParamUtil.getDate(actionRequest, "releaseDate", DateFormat.getInstance());
		double price = ParamUtil.getDouble(actionRequest, "price",1);
		//add mobilePhone record
		
		//create primary key
		long mobilePhoneId=CounterLocalServiceUtil.increment();
		
		//create mobilePhone persistance object
		MobilePhone mobilePhone=null;
		mobilePhone=new MobilePhoneImpl();
		mobilePhone=MobilePhoneLocalServiceUtil.createMobilePhone(mobilePhoneId);
		
		//fill the data in persistance object
		mobilePhone.setBrand(brand);
		mobilePhone.setName(name);
		mobilePhone.setDescription(description);
		mobilePhone.setReleaseDate(releaseDate);
		mobilePhone.setPrice(price);
		
		//Add mobilePhone persistance object to database mobilePhone table
		mobilePhone=MobilePhoneLocalServiceUtil.addMobilePhone(mobilePhone);
		if(mobilePhone!=null){
			// adding success message
			SessionMessages.add(actionRequest.getPortletSession(),
					"mobilePhone-add-success");
			_log.info("MobilePhone have been added successfylly");
		}else{
			SessionErrors.add(actionRequest.getPortletSession(),"mobilePhone-add-error");
			_log.error("There is an Erron in adding MobilePhone");
		}
		//navigate to add mobilePhone jsp page
		actionResponse.setRenderParameter("mvcPath",
				"/html/jsps/mobile_phone/add.jsp");
		}catch(Exception e){
			SessionErrors.add(actionRequest.getPortletSession(),"mobilePhone-add-error");
			e.printStackTrace();
		}
	}
	public void deleteMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			long mobilePhoneId = ParamUtil.getLong(actionRequest,"mobilePhoneId");
			MobilePhone mobilePhone=MobilePhoneLocalServiceUtil.deleteMobilePhone(mobilePhoneId);
			if(mobilePhone!=null){
				// adding success message
				SessionMessages.add(actionRequest.getPortletSession(),
						"mobilePhone-delete-success");
				_log.info("MobilePhone have been deleted successfylly");
			}else{
				SessionErrors.add(actionRequest.getPortletSession(),"mobilePhone-delete-error");
				_log.error("There is an Erron in delete MobilePhone");
			}
			//navigate to add mobilePhone jsp page
			actionResponse.setRenderParameter("mvcPath",
					"/html/jsps/mobile_phone/delete.jsp");
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"mobilePhone-add-error");
			e.printStackTrace();
		}
	}

	public void updateMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			long mobilePhoneId = ParamUtil.getLong(actionRequest,"mobilePhoneId");
			String name = ParamUtil.getString(actionRequest, "name");
			String brand = ParamUtil.getString(actionRequest, "brand");
			String description = ParamUtil.getString(actionRequest, "description");
			Date releaseDate = ParamUtil.getDate(actionRequest, "releaseDate", DateFormat.getInstance());
			double price = ParamUtil.getDouble(actionRequest, "price",1);
			
			MobilePhone mobilePhone=MobilePhoneLocalServiceUtil.getMobilePhone(mobilePhoneId);
			
			if(mobilePhone!=null){
				
				//fill update information
				mobilePhone.setBrand(brand);
				mobilePhone.setName(name);
				mobilePhone.setDescription(description);
				mobilePhone.setReleaseDate(releaseDate);
				mobilePhone.setPrice(price);
				
				mobilePhone=MobilePhoneLocalServiceUtil.updateMobilePhone(mobilePhone);
				
				if(mobilePhone!=null){
					// adding success message
					SessionMessages.add(actionRequest.getPortletSession(),
							"mobilePhone-update-success");
					
					_log.info("MobilePhone have been updated successfylly");
				} else{
					SessionErrors.add(actionRequest.getPortletSession(),"mobilePhone-update-error");
					_log.error("There is an Erron in delete MobilePhone");
				}
			}else{
				SessionErrors.add(actionRequest.getPortletSession(),"mobilePhone-update-error");
				_log.error("Could not find mobilePhone.");
			}
			//navigate to add mobilePhone jsp page
			actionResponse.setRenderParameter("mvcPath",
					"/html/jsps/mobile_phone/edit.jsp");
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"mobilePhone-update-error");
			e.printStackTrace();
		}
	}
	public void getMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			long mobilePhoneId = ParamUtil.getLong(actionRequest,"mobilePhoneId");
			String cmd=ParamUtil.getString(actionRequest,"cmd");
			MobilePhone mobilePhone=MobilePhoneLocalServiceUtil.getMobilePhone(mobilePhoneId);
			if(mobilePhone!=null){
				// adding success message
				actionRequest.setAttribute("mobilePhoneObject",mobilePhone);
				_log.info("MobilePhone have been found for specific primary key successfylly");
			}else{
				_log.error("MobilePhone not found");
			}
			if(cmd.equals("DELETE")){
				//navigate to add mobilePhone jsp page
				actionResponse.setRenderParameter("mvcPath",
						"/html/jsps/mobile_phone/delete.jsp");
			}
			if(cmd.equals("UPDATE")){
				//navigate to add mobilePhone jsp page
				actionResponse.setRenderParameter("mvcPath",
						"/html/jsps/mobile_phone/edit.jsp");
			}
			if(cmd.equals("VIEW")){
				//navigate to add mobilePhone jsp page
				actionResponse.setRenderParameter("mvcPath",
						"/html/jsps/mobile_phone/display.jsp");
			}
			
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"mobilePhone-add-error");
			e.printStackTrace();
		}
	}
	private static Log _log = LogFactoryUtil.getLog(PhoneManagerMVCPortletAction.class);
}