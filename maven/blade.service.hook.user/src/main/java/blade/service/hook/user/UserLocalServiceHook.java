/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blade.service.hook.user;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceWrapper;
import com.liferay.portal.service.UserLocalServiceWrapper;

@Component(
		service = ServiceWrapper.class
)
public class UserLocalServiceHook extends UserLocalServiceWrapper {

	public UserLocalServiceHook() {
		super(null);
	}

	@Override
	public User getUser(long userId) throws PortalException {
		System.out.println("Getting user by id " + userId);
		return super.getUser(userId);
	}

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress,
			String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap, Map<String, Object> resultsMap)
			throws PortalException {
		System.out.println("Authenticating user by email address " + emailAddress);
		return super.authenticateByEmailAddress(companyId, emailAddress, password,
				headerMap, parameterMap, resultsMap);
	}

    @Override
    public com.liferay.portal.model.User addUser(long creatorUserId,
        long companyId, boolean autoPassword, java.lang.String password1,
        java.lang.String password2, boolean autoScreenName,
        java.lang.String screenName, java.lang.String emailAddress,
        long facebookId, java.lang.String openId, java.util.Locale locale,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, long prefixId, long suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear,
        java.lang.String jobTitle, long[] groupIds, long[] organizationIds,
        long[] roleIds, long[] userGroupIds, boolean sendEmail,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException {
        System.out.println("addUser1: " +firstName + " " + lastName + ", " +  emailAddress);
        return super.addUser(creatorUserId, companyId,
                autoPassword, password1, password2, autoScreenName, screenName,
                emailAddress, facebookId, openId, locale, firstName, middleName,
                lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay,
                birthdayYear, jobTitle, groupIds, organizationIds, roleIds,
                userGroupIds, sendEmail, serviceContext);
    }
    
    @Override
    public com.liferay.portal.model.User addUser(
            com.liferay.portal.model.User user) {
        System.out.println("addUser2: " +user.getFirstName() + " " + user.getLastName() + ", " +  user.getEmailAddress());
            return super.addUser(user);
        }

    @Override
    public com.liferay.portal.model.User addUserWithWorkflow(
        long creatorUserId, long companyId, boolean autoPassword,
        java.lang.String password1, java.lang.String password2,
        boolean autoScreenName, java.lang.String screenName,
        java.lang.String emailAddress, long facebookId,
        java.lang.String openId, java.util.Locale locale,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, long prefixId, long suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear,
        java.lang.String jobTitle, long[] groupIds, long[] organizationIds,
        long[] roleIds, long[] userGroupIds, boolean sendEmail,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException {
        System.out.println("addUserWithWorkflow: " +firstName + " " + lastName + ", " +  emailAddress);
        return super.addUserWithWorkflow(creatorUserId, companyId,
            autoPassword, password1, password2, autoScreenName, screenName,
            emailAddress, facebookId, openId, locale, firstName, middleName,
            lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay,
            birthdayYear, jobTitle, groupIds, organizationIds, roleIds,
            userGroupIds, sendEmail, serviceContext);
    }

    /**
    * Updates the user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param user the user
    * @return the user that was updated
    */
    @Override
    public com.liferay.portal.model.User updateUser(
        com.liferay.portal.model.User user) {
        System.out.println("updateUser1: " +user.getFirstName() + " " + user.getLastName() + ", " +  user.getEmailAddress());
        return super.updateUser(user);
    }

    @Override
    public com.liferay.portal.model.User updateUser(long userId,
        java.lang.String oldPassword, java.lang.String newPassword1,
        java.lang.String newPassword2, boolean passwordReset,
        java.lang.String reminderQueryQuestion,
        java.lang.String reminderQueryAnswer, java.lang.String screenName,
        java.lang.String emailAddress, long facebookId,
        java.lang.String openId, boolean portrait, byte[] portraitBytes,
        java.lang.String languageId, java.lang.String timeZoneId,
        java.lang.String greeting, java.lang.String comments,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, long prefixId, long suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear,
        java.lang.String smsSn, java.lang.String aimSn,
        java.lang.String facebookSn, java.lang.String icqSn,
        java.lang.String jabberSn, java.lang.String msnSn,
        java.lang.String mySpaceSn, java.lang.String skypeSn,
        java.lang.String twitterSn, java.lang.String ymSn,
        java.lang.String jobTitle, long[] groupIds, long[] organizationIds,
        long[] roleIds,
        java.util.List<com.liferay.portal.model.UserGroupRole> userGroupRoles,
        long[] userGroupIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException {
        System.out.println("updateUser2: " +firstName + " " + lastName + ", " +  emailAddress);
        return super.updateUser(userId, oldPassword, newPassword1,
            newPassword2, passwordReset, reminderQueryQuestion,
            reminderQueryAnswer, screenName, emailAddress, facebookId, openId,
            portrait, portraitBytes, languageId, timeZoneId, greeting,
            comments, firstName, middleName, lastName, prefixId, suffixId,
            male, birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn,
            facebookSn, icqSn, jabberSn, msnSn, mySpaceSn, skypeSn, twitterSn,
            ymSn, jobTitle, groupIds, organizationIds, roleIds, userGroupRoles,
            userGroupIds, serviceContext);
    }

    @Override
    public void completeUserRegistration(com.liferay.portal.model.User user,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException {
        System.out.println("completeUserRegistration: " +user.getFirstName() + " " + user.getLastName() + ", " +  user.getEmailAddress());
        super.completeUserRegistration(user, serviceContext);
    }

    @Override
    public com.liferay.portal.model.User createUser(long userId) {
        System.out.println("createUser: " +userId);
        return super.createUser(userId);
    }
}