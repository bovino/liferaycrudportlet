package com.meera.liferaymvc;

import java.text.DateFormat;
import java.util.Date;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.dbservice.model.MobilePhone;
import com.meera.dbservice.model.impl.MobilePhoneImpl;
import com.meera.dbservice.service.MobilePhoneLocalServiceUtil;

public class PhoneManagerMVCPortletAction extends MVCPortlet {
		
	 	public void addMobilePhone(ActionRequest request, ActionResponse response)
		     throws Exception {
		
			 _updateMobilePhone(request);		
			 sendRedirect(request, response);
		 
		}
		
		public void deleteMobilePhone(ActionRequest request, ActionResponse response)
		 throws Exception {
		
			 long mobilePhoneId = ParamUtil.getLong(request, "mobilePhoneId");		
			 MobilePhoneLocalServiceUtil.deleteMobilePhone(mobilePhoneId);		
			 sendRedirect(request, response);
		}
		
		public void updateMobilePhone(ActionRequest request, ActionResponse response)
		 throws Exception {
		
			_updateMobilePhone(request);		
			sendRedirect(request, response);
		}
	
		private MobilePhone _updateMobilePhone(ActionRequest request) 
		        throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		
		    long mobilePhoneId = (ParamUtil.getLong(request, "mobilePhoneId"));
		    String name = (ParamUtil.getString(request, "name"));
		    String description = (ParamUtil.getString(request, "description"));
		    String brand = (ParamUtil.getString(request, "brand"));
		    Date releaseDate = (ParamUtil.getDate(request, "releaseDate", DateFormat.getInstance()));
		    double price = (ParamUtil.getDouble(request, "price"));
		    		
		    MobilePhone mobilePhone = null;
		
		    if (mobilePhoneId <= 0) {
		    	
		    	//create primary key
				mobilePhoneId = CounterLocalServiceUtil.increment();
				
				//create mobilePhone persistance object
				mobilePhone=new MobilePhoneImpl();
				mobilePhone=MobilePhoneLocalServiceUtil.createMobilePhone(mobilePhoneId);
		    	
				mobilePhone.setName(name);
		        mobilePhone.setBrand(brand);
		        mobilePhone.setDescription(description);
		        mobilePhone.setReleaseDate(releaseDate);
		        mobilePhone.setPrice(price);
		        mobilePhone = MobilePhoneLocalServiceUtil.addMobilePhone(mobilePhone);
		        
		    }
		    else {
		        
		    	mobilePhone = MobilePhoneLocalServiceUtil.getMobilePhone(mobilePhoneId);
		        mobilePhone.setName(name);
		        mobilePhone.setBrand(brand);
		        mobilePhone.setDescription(description);
		        mobilePhone.setReleaseDate(releaseDate);
		        mobilePhone.setPrice(price);
		        
		        mobilePhone = MobilePhoneLocalServiceUtil.updateMobilePhone(mobilePhone);
		    }
		
		    return mobilePhone;
		}
		
		@SuppressWarnings("unused")
		private static Log _log = LogFactoryUtil.getLog(PhoneManagerMVCPortletAction.class);
}