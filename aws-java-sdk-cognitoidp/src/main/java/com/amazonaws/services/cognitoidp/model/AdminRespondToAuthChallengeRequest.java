/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to respond to the authentication challenge, as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRespondToAuthChallenge"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminRespondToAuthChallengeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The app client ID.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * </p>
     */
    private String challengeName;
    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     */
    private java.util.Map<String, String> challengeResponses;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     */
    private String session;

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the Amazon Cognito user pool.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @return The ID of the Amazon Cognito user pool.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @return The app client ID.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * </p>
     * 
     * @return The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminRespondToAuthChallengeRequest withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href="API_AdminInitiateAuth.html">AdminInitiateAuth</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminRespondToAuthChallengeRequest withChallengeName(ChallengeNameType challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     * 
     * @return The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *         example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     *         client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *         <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *         <code>SECRET_HASH</code> (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     *         (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *         <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such
     *         as email address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response
     *         includes the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you
     *         specified an alias in your call to <code>AdminInitiateAuth</code>.
     */

    public java.util.Map<String, String> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *        example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     *        client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *        <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     *        app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *        <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as
     *        email address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes
     *        the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an
     *        alias in your call to <code>AdminInitiateAuth</code>.
     */

    public void setChallengeResponses(java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *        example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     *        client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *        <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     *        app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *        <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as
     *        email address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes
     *        the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an
     *        alias in your call to <code>AdminInitiateAuth</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withChallengeResponses(java.util.Map<String, String> challengeResponses) {
        setChallengeResponses(challengeResponses);
        return this;
    }

    public AdminRespondToAuthChallengeRequest addChallengeResponsesEntry(String key, String value) {
        if (null == this.challengeResponses) {
            this.challengeResponses = new java.util.HashMap<String, String>();
        }
        if (this.challengeResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.challengeResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeResponses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest clearChallengeResponsesEntries() {
        this.challengeResponses = null;
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs
     *        to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. If
     *         <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller
     *         needs to go through another challenge, they return a session with other challenge parameters. This
     *         session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs
     *        to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getChallengeName() != null)
            sb.append("ChallengeName: ").append(getChallengeName()).append(",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: ").append(getChallengeResponses()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminRespondToAuthChallengeRequest == false)
            return false;
        AdminRespondToAuthChallengeRequest other = (AdminRespondToAuthChallengeRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        return hashCode;
    }

    @Override
    public AdminRespondToAuthChallengeRequest clone() {
        return (AdminRespondToAuthChallengeRequest) super.clone();
    }

}
