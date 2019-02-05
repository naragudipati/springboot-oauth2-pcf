# springboot-oauth2-pcf
PCF OAUTH2 implementaion
Step1 :Create a PCF Service for SSO implementaion
cf cs p-identity okta-sso-nonprod mypcfsso
Step2 :Bind the service to the application
cf bs springboot-oauth2-pcf mypcfsso
Step3: Generate access token 
 "POST" a request on the "https://$OauthEndpoint/oauth/token  " , Type Basic Auth, user name / password from the CF Env 
 Content type =application/x-www-form-urlencoded ( Under the body tab in postman chose x-www-form-urlencoded)
 Step5: Access the api end point use Query parmater ?access_token=xxxx(from step3)
