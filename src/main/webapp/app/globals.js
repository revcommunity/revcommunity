var ANONYMOUS_USER = 'anonymousUser';
var LOGIN_REF_ID = 'top-bar-login-ref';
var REGISTRATION_REF_ID = 'top-bar-reg-ref';
var USERNAME_REF_ID = 'top-bar-user-ref';
Ext.live = function (selector, event, handler) {
    Ext.getBody().on(event, function(event, target){
        handler.apply(Ext.get(target), arguments);
    }, null, {
        delegate: selector
    });
};