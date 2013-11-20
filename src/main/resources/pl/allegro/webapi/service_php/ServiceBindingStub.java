/**
 * ServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class ServiceBindingStub extends org.apache.axis.client.Stub implements pl.allegro.webapi.service_php.ServicePort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[135];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddDescToItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest"), pl.allegro.webapi.service_php.DoAddDescToItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoAddDescToItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddDescToItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddPackageInfoToPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest"), pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddPackageInfoToPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest"), pl.allegro.webapi.service_php.DoAddToBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoAddToBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToWatchListRequest"), pl.allegro.webapi.service_php.DoAddToWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToWatchListResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoAddToWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest"), pl.allegro.webapi.service_php.DoBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest"), pl.allegro.webapi.service_php.DoCancelBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCancelBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormsRequest"), pl.allegro.webapi.service_php.DoCancelRefundFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCancelRefundFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundWarnings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundWarningsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningsRequest"), pl.allegro.webapi.service_php.DoCancelRefundWarningsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundWarningsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest"), pl.allegro.webapi.service_php.DoCancelTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCancelTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest"), pl.allegro.webapi.service_php.DoChangeItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoChangeItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangePriceItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest"), pl.allegro.webapi.service_php.DoChangePriceItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoChangePriceItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangePriceItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeQuantityItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest"), pl.allegro.webapi.service_php.DoChangeQuantityItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoChangeQuantityItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeQuantityItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckExternalKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckExternalKeyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckExternalKeyRequest"), pl.allegro.webapi.service_php.DoCheckExternalKeyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckExternalKeyResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCheckExternalKeyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckExternalKeyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckItemDescriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest"), pl.allegro.webapi.service_php.DoCheckItemDescriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckItemDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest"), pl.allegro.webapi.service_php.DoCheckNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCreateItemTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest"), pl.allegro.webapi.service_php.DoCreateItemTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoCreateItemTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCreateItemTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest"), pl.allegro.webapi.service_php.DoFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackManyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest"), pl.allegro.webapi.service_php.DoFeedbackManyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoFeedbackManyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackManyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest"), pl.allegro.webapi.service_php.DoFinishItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoFinishItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest"), pl.allegro.webapi.service_php.DoFinishItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoFinishItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetAdminUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest"), pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetAdminUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBidItem2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request"), pl.allegro.webapi.service_php.DoGetBidItem2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetBidItem2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBidItem2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBlackListUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest"), pl.allegro.webapi.service_php.DoGetBlackListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetBlackListUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBlackListUsersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCategoryPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest"), pl.allegro.webapi.service_php.DoGetCategoryPathRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetCategoryPathResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCategoryPathResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest"), pl.allegro.webapi.service_php.DoGetCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest"), pl.allegro.webapi.service_php.DoGetCatsDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetCatsDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest"), pl.allegro.webapi.service_php.DoGetCatsDataLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest"), pl.allegro.webapi.service_php.DoGetCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest"), pl.allegro.webapi.service_php.DoGetDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest"), pl.allegro.webapi.service_php.DoGetFavouriteCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest"), pl.allegro.webapi.service_php.DoGetFavouriteSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest"), pl.allegro.webapi.service_php.DoGetFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFilledPostBuyFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest"), pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFilledPostBuyFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest"), pl.allegro.webapi.service_php.DoGetItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest"), pl.allegro.webapi.service_php.DoGetItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsImagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest"), pl.allegro.webapi.service_php.DoGetItemsImagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetItemsImagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsImagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest"), pl.allegro.webapi.service_php.DoGetItemsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetItemsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest"), pl.allegro.webapi.service_php.DoGetItemsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetItemsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMessageToBuyerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest"), pl.allegro.webapi.service_php.DoGetMessageToBuyerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMessageToBuyerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest"), pl.allegro.webapi.service_php.DoGetMyAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyBidItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest"), pl.allegro.webapi.service_php.DoGetMyBidItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyBidItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyBidItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyCurrentShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest"), pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest"), pl.allegro.webapi.service_php.DoGetMyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyFutureItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest"), pl.allegro.webapi.service_php.DoGetMyFutureItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyFutureItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest"), pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest"), pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotSoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest"), pl.allegro.webapi.service_php.DoGetMyNotSoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotSoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest"), pl.allegro.webapi.service_php.DoGetMyNotWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest"), pl.allegro.webapi.service_php.DoGetMyPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest"), pl.allegro.webapi.service_php.DoGetMyPaymentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest"), pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest"), pl.allegro.webapi.service_php.DoGetMyPayoutsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyPayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest"), pl.allegro.webapi.service_php.DoGetMySellItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMySellItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellRatingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest"), pl.allegro.webapi.service_php.DoGetMySellRatingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMySellRatingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellRatingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest"), pl.allegro.webapi.service_php.DoGetMySoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMySoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWatchItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchItemsRequest"), pl.allegro.webapi.service_php.DoGetMyWatchItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWatchItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWatchedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchedItemsRequest"), pl.allegro.webapi.service_php.DoGetMyWatchedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchedItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWatchedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest"), pl.allegro.webapi.service_php.DoGetMyWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetMyWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest"), pl.allegro.webapi.service_php.DoGetPaymentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPaymentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentMethodsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest"), pl.allegro.webapi.service_php.DoGetPaymentMethodsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentMethodsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest"), pl.allegro.webapi.service_php.DoGetPostBuyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPostBuyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForBuyersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest"), pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForBuyersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest"), pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest"), pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyItemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest"), pl.allegro.webapi.service_php.DoGetPostBuyItemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyItemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundFormsStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundFormsStatusesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundFormsStatusesRequest"), pl.allegro.webapi.service_php.DoGetRefundFormsStatusesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundFormsStatusesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundFormsStatusesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundReasonsRequest"), pl.allegro.webapi.service_php.DoGetRefundReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundReasonsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetRefundReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundTransactions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundTransactionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundTransactionsRequest"), pl.allegro.webapi.service_php.DoGetRefundTransactionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundTransactionsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundTransactionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest"), pl.allegro.webapi.service_php.DoGetRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormAttribsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest"), pl.allegro.webapi.service_php.DoGetSellFormAttribsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormAttribsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest"), pl.allegro.webapi.service_php.DoGetSellFormFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest"), pl.allegro.webapi.service_php.DoGetSellFormFieldsExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest"), pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsForCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest"), pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsForCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest"), pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellRatingReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest"), pl.allegro.webapi.service_php.DoGetSellRatingReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellRatingReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetServiceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceInfoRequest"), pl.allegro.webapi.service_php.DoGetServiceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetServiceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetServiceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceInfoCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetServiceInfoCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceInfoCategoriesRequest"), pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceInfoCategoriesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetServiceInfoCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetServiceTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceTemplatesRequest"), pl.allegro.webapi.service_php.DoGetServiceTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceTemplatesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetServiceTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSessionHandleForWidgetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest"), pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSessionHandleForWidgetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest"), pl.allegro.webapi.service_php.DoGetShipmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetShipmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataForRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest"), pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataForRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentPriceTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest"), pl.allegro.webapi.service_php.DoGetShipmentPriceTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentPriceTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShopCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopCatsDataRequest"), pl.allegro.webapi.service_php.DoGetShopCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopCatsDataResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetShopCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShopCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest"), pl.allegro.webapi.service_php.DoGetSiteJournalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSiteJournalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest"), pl.allegro.webapi.service_php.DoGetSiteJournalDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest"), pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest"), pl.allegro.webapi.service_php.DoGetSiteJournalInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSitesFlagInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSitesFlagInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSitesFlagInfoRequest"), pl.allegro.webapi.service_php.DoGetSitesFlagInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSitesFlagInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSitesFlagInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSitesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSitesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSitesInfoRequest"), pl.allegro.webapi.service_php.DoGetSitesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSitesInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSitesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSitesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSpecialItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSpecialItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSpecialItemsRequest"), pl.allegro.webapi.service_php.DoGetSpecialItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSpecialItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSpecialItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSpecialItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetStatesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest"), pl.allegro.webapi.service_php.DoGetStatesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetStatesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetStatesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSystemTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest"), pl.allegro.webapi.service_php.DoGetSystemTimeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetSystemTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSystemTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetTransactionsIDsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"), pl.allegro.webapi.service_php.DoGetTransactionsIDsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetTransactionsIDsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest"), pl.allegro.webapi.service_php.DoGetUserIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetUserIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserItemsRequest"), pl.allegro.webapi.service_php.DoGetUserItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserItemsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetUserItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest"), pl.allegro.webapi.service_php.DoGetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest"), pl.allegro.webapi.service_php.DoGetUserLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetUserLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest"), pl.allegro.webapi.service_php.DoGetWaitingFeedbacksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest"), pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doInternalIStoreChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoInternalIStoreChangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoInternalIStoreChangeRequest"), pl.allegro.webapi.service_php.DoInternalIStoreChangeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doInternalIStoreChangeResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doInternalIStoreChangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest"), pl.allegro.webapi.service_php.DoLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginEncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest"), pl.allegro.webapi.service_php.DoLoginEncRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoLoginEncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginEncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMakeDiscount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMakeDiscountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMakeDiscountRequest"), pl.allegro.webapi.service_php.DoMakeDiscountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMakeDiscountResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMakeDiscountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMakeDiscountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMakeDiscountByCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMakeDiscountByCouponRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMakeDiscountByCouponRequest"), pl.allegro.webapi.service_php.DoMakeDiscountByCouponRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMakeDiscountByCouponResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMakeDiscountByCouponResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccount2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request"), pl.allegro.webapi.service_php.DoMyAccount2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyAccount2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccount2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccountItemsCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest"), pl.allegro.webapi.service_php.DoMyAccountItemsCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccountItemsCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest"), pl.allegro.webapi.service_php.DoMyBillingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyBillingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest"), pl.allegro.webapi.service_php.DoMyBillingItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyBillingItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyContactRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest"), pl.allegro.webapi.service_php.DoMyContactRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyContactResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyContactResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request"), pl.allegro.webapi.service_php.DoMyFeedback2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyFeedback2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2LimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest"), pl.allegro.webapi.service_php.DoMyFeedback2LimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2LimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest"), pl.allegro.webapi.service_php.DoNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQueryAllSysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest"), pl.allegro.webapi.service_php.DoQueryAllSysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQueryAllSysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQuerySysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest"), pl.allegro.webapi.service_php.DoQuerySysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoQuerySysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQuerySysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest"), pl.allegro.webapi.service_php.DoRemoveFromBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromWatchListRequest"), pl.allegro.webapi.service_php.DoRemoveFromWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest"), pl.allegro.webapi.service_php.DoRemoveItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestCancelBidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest"), pl.allegro.webapi.service_php.DoRequestCancelBidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoRequestCancelBidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestCancelBidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestPayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest"), pl.allegro.webapi.service_php.DoRequestPayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoRequestPayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestPayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestSurchargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest"), pl.allegro.webapi.service_php.DoRequestSurchargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoRequestSurchargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestSurchargeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSearchRequest"), pl.allegro.webapi.service_php.DoSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSearchResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest"), pl.allegro.webapi.service_php.DoSellSomeAgainRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSellSomeAgainResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainInShopRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest"), pl.allegro.webapi.service_php.DoSellSomeAgainInShopRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainInShopResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendEmailToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest"), pl.allegro.webapi.service_php.DoSendEmailToUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSendEmailToUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendEmailToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest"), pl.allegro.webapi.service_php.DoSendPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSendPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendRefundFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormsRequest"), pl.allegro.webapi.service_php.DoSendRefundFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormsResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSendRefundFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendRefundFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendReminderMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendReminderMessagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendReminderMessagesRequest"), pl.allegro.webapi.service_php.DoSendReminderMessagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendReminderMessagesResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSendReminderMessagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendReminderMessagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest"), pl.allegro.webapi.service_php.DoSetShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest"), pl.allegro.webapi.service_php.DoSetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowCat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowCatRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowCatRequest"), pl.allegro.webapi.service_php.DoShowCatRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowCatResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoShowCatResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowCatResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowItemInfoExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest"), pl.allegro.webapi.service_php.DoShowItemInfoExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoShowItemInfoExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowItemInfoExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest"), pl.allegro.webapi.service_php.DoShowUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoShowUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUserPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserPageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserPageRequest"), pl.allegro.webapi.service_php.DoShowUserPageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserPageResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoShowUserPageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserPageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoVerifyItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest"), pl.allegro.webapi.service_php.DoVerifyItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse"));
        oper.setReturnClass(pl.allegro.webapi.service_php.DoVerifyItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doVerifyItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

    }

    public ServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddDescToItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddDescToItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddToBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddToBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToWatchListRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddToWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToWatchListResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoAddToWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelRefundFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelRefundFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelRefundWarningsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCancelTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoChangeItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoChangeItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoChangePriceItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoChangePriceItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoChangeQuantityItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoChangeQuantityItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckExternalKeyRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCheckExternalKeyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckExternalKeyResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCheckExternalKeyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCheckItemDescriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCheckNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCreateItemTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoCreateItemTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFeedbackManyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFeedbackManyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFinishItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFinishItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFinishItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoFinishItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetBidItem2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetBidItem2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetBlackListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetBlackListUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCategoryPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCategoryPathResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCatsDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCatsDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCatsDataLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCountriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetCountriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFavouriteCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFavouriteSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemsImagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemsImagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMessageToBuyerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyBidItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyBidItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyFutureItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyNotSoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyNotWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPaymentsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPayoutsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyPayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMySellItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMySellItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMySellRatingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMySellRatingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMySoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMySoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchedItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyWatchedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchedItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyWatchItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetMyWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPaymentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPaymentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPaymentMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyItemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundFormsStatusesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRefundFormsStatusesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundFormsStatusesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundReasonsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRefundReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundReasonsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRefundReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundTransactionsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRefundTransactionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundTransactionsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormAttribsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellRatingReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceInfoCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceInfoCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetServiceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetServiceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetServiceTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShipmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShipmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShipmentPriceTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShopCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetShopCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSiteJournalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSitesFlagInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSitesFlagInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSitesFlagInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSitesInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSitesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSitesInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSitesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSpecialItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSpecialItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSpecialItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSpecialItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetStatesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetStatesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSystemTimeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetSystemTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetTransactionsIDsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetUserLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetWaitingFeedbacksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoInternalIStoreChangeRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoInternalIStoreChangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doInternalIStoreChangeResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoLoginEncRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoLoginEncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMakeDiscountByCouponRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMakeDiscountByCouponRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMakeDiscountByCouponResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMakeDiscountRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMakeDiscountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMakeDiscountResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMakeDiscountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyAccount2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyAccount2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyAccountItemsCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyBillingItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyBillingItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyBillingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyBillingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyContactRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyContactResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyFeedback2LimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyFeedback2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoMyFeedback2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoQueryAllSysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoQuerySysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoQuerySysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRemoveFromBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromWatchListRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRemoveFromWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRemoveItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRequestCancelBidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRequestCancelBidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRequestPayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRequestPayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRequestSurchargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoRequestSurchargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSearchRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSearchResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSellSomeAgainInShopRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSellSomeAgainRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSellSomeAgainResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendEmailToUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendEmailToUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormsRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendRefundFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormsResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendRefundFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendReminderMessagesRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendReminderMessagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendReminderMessagesResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSendReminderMessagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSetShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowCatRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowCatRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowCatResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowCatResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowItemInfoExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowItemInfoExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserPageRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowUserPageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserPageResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowUserPageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoShowUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoVerifyItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DoVerifyItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ActionDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ActionDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AddressInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AddressUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AdvertInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AdvertInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfActiondatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ActionDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ActionDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAddressinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AddressInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAttribstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AttribStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBiditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BidItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBidliststruct2");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BidListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBillingdatatype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BillingDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BillingDataType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlacklistresstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BlackListResStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlackliststruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCancelrefunddatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCancelrefundformresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundFormResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundFormResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCancelrefundwarningresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundWarningResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundWarningResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCancelrefundwarningstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundWarningStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundWarningStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategoriesstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoriesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorydata");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoryData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorypathtype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoryPathType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorytreetype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoryTreeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCatinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CatInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCountryinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CountryInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfDealsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritescategoriesstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FavouritesCategoriesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesCategoriesStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritessellersstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FavouritesSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbacklist");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FeedbackList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackmanystruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FeedbackManyStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FeedbackResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FieldsValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilterOptionsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FiltersListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFiltervaluetype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilterValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishfailurestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FinishFailureStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishitemsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FinishItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFutureitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FutureItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInfocatlist");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.InfoCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InfoCatList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItembilling");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemBilling[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemgetimage");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemGetImage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemGetImage");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemImageList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagesstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemImagesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImagesStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfIteminfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempricestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemPriceStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemreminderstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemReminderStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemReminderStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemremovewatchstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemRemoveWatchStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemRemoveWatchStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemslisttype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsnotaddedstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemsNotAddedStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsNotAddedStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsurchargestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemSurchargeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemtemplateliststruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemTemplateListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyaccountstruct2");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MyAccountStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMycontactlist");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MyContactList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyContactList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyfeedbackliststruct2");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MyFeedbackListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyFeedbackListStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNewpostbuyformsellerstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NewPostBuyFormSellerStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotsolditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NotSoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotwonitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NotWonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPackageinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PackageInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfParameterinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ParameterInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentdetailsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentDetailsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentitemsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentmethodstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentMethodStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentsellersstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPhotoinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PhotoInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostagestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformforbuyersdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormForBuyersDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformsellersstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformshipmenttrackingstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormShipmentTrackingStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyiteminfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPriceinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PriceInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersgroupstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ProductParametersGroupStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ProductParametersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundformdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundFormDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundformstatusresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundFormStatusResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormStatusResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundformstatusstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundFormStatusStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormStatusStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundreasonstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundReasonStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundReasonStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRelateditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RelatedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSearchresponsetype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SearchResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SearchResponseType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellershipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellerShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellformtype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellFormType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragepermonthstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingAveragePerMonthStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingAverageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingdetailstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingDetailStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingestimationstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingEstimationStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingEstimationStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratinginfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingReasonStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonsumstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingReasonSumStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonSumStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingstatsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingStatsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingStatsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSendrefundformresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendRefundFormResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendRefundFormResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSendrefundformstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendRefundFormStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendRefundFormStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSendremindermessageresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendReminderMessageResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendReminderMessageResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSendremindermessagestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendReminderMessageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendReminderMessageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfServiceinfocatstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ServiceInfoCatStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ServiceInfoCatStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfServiceinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ServiceInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ServiceInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpaymentinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentPaymentInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpricetypestruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentPriceTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSiteflaginfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteFlagInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteFlagInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSiteinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournal");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteJournal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournaldealsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteJournalDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSolditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSpecialauctionstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SpecialAuctionStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SpecialAuctionStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStateinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.StateInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellagain");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.StructSellAgain[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellfailed");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.StructSellFailed[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSysstatustype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SysStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfTemplateinfotype");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.TemplateInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TemplateInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblacklistaddresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserBlackListAddResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblackliststruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserBlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserIncomingPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserIncomingPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUseritemlist");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserItemList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserItemList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpayoutstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPayoutStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWaitfeedbackstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WaitFeedbackStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WaitFeedbackStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWatcheditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WatchedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchedItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWatchitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WatchItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWonitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BillingDataType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BillingDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundFormResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundFormResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundWarningResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundWarningResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundWarningStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CancelRefundWarningStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoriesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoryPathType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CategoryTreeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CreatedItemTemplateStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.CreatedItemTemplateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DiscountDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DiscountDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationTimeInfo");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.DurationTimeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesCategoriesStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FavouritesCategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesSellersStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FavouritesSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackList");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FeedbackList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FeedbackManyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FeedbackResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InfoCatList");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.InfoCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.InvoiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDiscountCouponStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemDiscountCouponStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemGetImage");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemGetImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImagesStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemImagesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemReminderStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemReminderStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemRemoveWatchStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemRemoveWatchStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsNotAddedStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemsNotAddedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemTemplateListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MessageToBuyerStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MessageToBuyerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyContactList");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyFeedbackListStruct2");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.MyFeedbackListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormCommonStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NewPostBuyFormCommonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NewPostBuyFormSellerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ParameterInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PhotoInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceCatInfo");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PriceCatInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PriceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.PriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormStatusResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundFormStatusResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormStatusStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundFormStatusStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundReasonStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RefundReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RelatedItemsShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RelatedItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RelatedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RemovedItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RemovedItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SearchOptType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SearchOptType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SearchResponseType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SearchResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellerInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellerPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellerShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingAveragePerMonthStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingDetailStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingEstimationStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingReasonSumStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SellRatingStatsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendRefundFormResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendRefundFormResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendRefundFormStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendRefundFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendReminderMessageResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendReminderMessageResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendReminderMessageStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SendReminderMessageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ServiceInfoCatStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ServiceInfoCatStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ServiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ServiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteFlagInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteFlagInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SortOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SpecialAuctionStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SpecialAuctionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TemplateInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.TemplateInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TransactionPayByLinkStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.TransactionPayByLinkStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserItemList");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WaitFeedbackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchedItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WatchedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WatchItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchListInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WatchListInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.allegro.webapi.service_php.WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public pl.allegro.webapi.service_php.DoAddDescToItemsResponse doAddDescToItems(pl.allegro.webapi.service_php.DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddDescToItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoAddDescToItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoAddDescToItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoAddDescToItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddPackageInfoToPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoAddToBlackListResponse doAddToBlackList(pl.allegro.webapi.service_php.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoAddToBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoAddToBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoAddToBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoAddToWatchListResponse doAddToWatchList(pl.allegro.webapi.service_php.DoAddToWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoAddToWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoAddToWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoAddToWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoBidItemResponse doBidItem(pl.allegro.webapi.service_php.DoBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCancelBidItemResponse doCancelBidItem(pl.allegro.webapi.service_php.DoCancelBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCancelBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCancelBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCancelBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCancelRefundFormsResponse doCancelRefundForms(pl.allegro.webapi.service_php.DoCancelRefundFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCancelRefundFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCancelRefundFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCancelRefundFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse doCancelRefundWarnings(pl.allegro.webapi.service_php.DoCancelRefundWarningsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundWarnings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundWarnings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCancelTransactionResponse doCancelTransaction(pl.allegro.webapi.service_php.DoCancelTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCancelTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCancelTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCancelTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoChangeItemFieldsResponse doChangeItemFields(pl.allegro.webapi.service_php.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoChangeItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoChangeItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoChangeItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoChangePriceItemResponse doChangePriceItem(pl.allegro.webapi.service_php.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangePriceItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoChangePriceItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoChangePriceItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoChangePriceItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoChangeQuantityItemResponse doChangeQuantityItem(pl.allegro.webapi.service_php.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoChangeQuantityItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoChangeQuantityItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoChangeQuantityItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCheckExternalKeyResponse doCheckExternalKey(pl.allegro.webapi.service_php.DoCheckExternalKeyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckExternalKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckExternalKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCheckExternalKeyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCheckExternalKeyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCheckExternalKeyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse doCheckItemDescription(pl.allegro.webapi.service_php.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckItemDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(pl.allegro.webapi.service_php.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoCreateItemTemplateResponse doCreateItemTemplate(pl.allegro.webapi.service_php.DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCreateItemTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoCreateItemTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoCreateItemTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoCreateItemTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoFeedbackResponse doFeedback(pl.allegro.webapi.service_php.DoFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoFeedbackManyResponse doFeedbackMany(pl.allegro.webapi.service_php.DoFeedbackManyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedbackMany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoFeedbackManyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoFeedbackManyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoFeedbackManyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoFinishItemResponse doFinishItem(pl.allegro.webapi.service_php.DoFinishItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoFinishItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoFinishItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoFinishItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoFinishItemsResponse doFinishItems(pl.allegro.webapi.service_php.DoFinishItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoFinishItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoFinishItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoFinishItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetAdminUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetBidItem2Response doGetBidItem2(pl.allegro.webapi.service_php.DoGetBidItem2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBidItem2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetBidItem2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetBidItem2Response) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetBidItem2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetBlackListUsersResponse doGetBlackListUsers(pl.allegro.webapi.service_php.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBlackListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetBlackListUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetBlackListUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetBlackListUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetCategoryPathResponse doGetCategoryPath(pl.allegro.webapi.service_php.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCategoryPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetCategoryPathResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetCategoryPathResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetCategoryPathResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetCatsDataResponse doGetCatsData(pl.allegro.webapi.service_php.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetCatsDataCountResponse doGetCatsDataCount(pl.allegro.webapi.service_php.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetCatsDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetCatsDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetCatsDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse doGetCatsDataLimit(pl.allegro.webapi.service_php.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetCountriesResponse doGetCountries(pl.allegro.webapi.service_php.DoGetCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetCountriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetCountriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetDealsResponse doGetDeals(pl.allegro.webapi.service_php.DoGetDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse doGetFavouriteCategories(pl.allegro.webapi.service_php.DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse doGetFavouriteSellers(pl.allegro.webapi.service_php.DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetFeedbackResponse doGetFeedback(pl.allegro.webapi.service_php.DoGetFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFilledPostBuyForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetItemFieldsResponse doGetItemFields(pl.allegro.webapi.service_php.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetItemTemplatesResponse doGetItemTemplates(pl.allegro.webapi.service_php.DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetItemsImagesResponse doGetItemsImages(pl.allegro.webapi.service_php.DoGetItemsImagesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsImages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetItemsImagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetItemsImagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetItemsImagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetItemsInfoResponse doGetItemsInfo(pl.allegro.webapi.service_php.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetItemsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetItemsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetItemsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetItemsListResponse doGetItemsList(pl.allegro.webapi.service_php.DoGetItemsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetItemsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetItemsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetItemsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse doGetMessageToBuyer(pl.allegro.webapi.service_php.DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMessageToBuyer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyAddressesResponse doGetMyAddresses(pl.allegro.webapi.service_php.DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyBidItemsResponse doGetMyBidItems(pl.allegro.webapi.service_php.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyBidItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyBidItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyBidItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyBidItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyCurrentShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyDataResponse doGetMyData(pl.allegro.webapi.service_php.DoGetMyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse doGetMyFutureItems(pl.allegro.webapi.service_php.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyFutureItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(pl.allegro.webapi.service_php.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotSoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse doGetMyNotWonItems(pl.allegro.webapi.service_php.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyPaymentsResponse doGetMyPayments(pl.allegro.webapi.service_php.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(pl.allegro.webapi.service_php.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyPayoutsResponse doGetMyPayouts(pl.allegro.webapi.service_php.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyPayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyPayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyPayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMySellItemsResponse doGetMySellItems(pl.allegro.webapi.service_php.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMySellItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMySellItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMySellItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMySellRatingResponse doGetMySellRating(pl.allegro.webapi.service_php.DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellRating");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMySellRatingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMySellRatingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMySellRatingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMySoldItemsResponse doGetMySoldItems(pl.allegro.webapi.service_php.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMySoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMySoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMySoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse doGetMyWatchItems(pl.allegro.webapi.service_php.DoGetMyWatchItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse doGetMyWatchedItems(pl.allegro.webapi.service_php.DoGetMyWatchedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetMyWonItemsResponse doGetMyWonItems(pl.allegro.webapi.service_php.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetMyWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetMyWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetMyWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPaymentDataResponse doGetPaymentData(pl.allegro.webapi.service_php.DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPaymentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPaymentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPaymentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse doGetPaymentMethods(pl.allegro.webapi.service_php.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPostBuyDataResponse doGetPostBuyData(pl.allegro.webapi.service_php.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPostBuyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPostBuyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPostBuyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForBuyers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(pl.allegro.webapi.service_php.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyItemInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse doGetRefundFormsStatuses(pl.allegro.webapi.service_php.DoGetRefundFormsStatusesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundFormsStatuses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundFormsStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetRefundReasonsResponse doGetRefundReasons(pl.allegro.webapi.service_php.DoGetRefundReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetRefundReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetRefundReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetRefundReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse doGetRefundTransactions(pl.allegro.webapi.service_php.DoGetRefundTransactionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundTransactions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetRelatedItemsResponse doGetRelatedItems(pl.allegro.webapi.service_php.DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse doGetSellFormAttribs(pl.allegro.webapi.service_php.DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormAttribs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse doGetSellFormFields(pl.allegro.webapi.service_php.DoGetSellFormFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(pl.allegro.webapi.service_php.DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExtLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsForCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse doGetSellFormFieldsLimit(pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse doGetSellRatingReasons(pl.allegro.webapi.service_php.DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellRatingReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetServiceInfoResponse doGetServiceInfo(pl.allegro.webapi.service_php.DoGetServiceInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetServiceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetServiceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetServiceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetServiceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse doGetServiceInfoCategories(pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetServiceInfoCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetServiceInfoCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse doGetServiceTemplates(pl.allegro.webapi.service_php.DoGetServiceTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetServiceTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetServiceTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse doGetSessionHandleForWidget(pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSessionHandleForWidget");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetShipmentDataResponse doGetShipmentData(pl.allegro.webapi.service_php.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetShipmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetShipmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetShipmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentDataForRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(pl.allegro.webapi.service_php.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentPriceTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetShopCatsDataResponse doGetShopCatsData(pl.allegro.webapi.service_php.DoGetShopCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShopCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShopCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetShopCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetShopCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetShopCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSiteJournalResponse doGetSiteJournal(pl.allegro.webapi.service_php.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSiteJournalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(pl.allegro.webapi.service_php.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDealsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(pl.allegro.webapi.service_php.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse doGetSitesFlagInfo(pl.allegro.webapi.service_php.DoGetSitesFlagInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSitesFlagInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSitesFlagInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSitesInfoResponse doGetSitesInfo(pl.allegro.webapi.service_php.DoGetSitesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSitesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSitesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSitesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSitesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSitesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSpecialItemsResponse doGetSpecialItems(pl.allegro.webapi.service_php.DoGetSpecialItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSpecialItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSpecialItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSpecialItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSpecialItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSpecialItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetStatesInfoResponse doGetStatesInfo(pl.allegro.webapi.service_php.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetStatesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetStatesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetStatesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetStatesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetSystemTimeResponse doGetSystemTime(pl.allegro.webapi.service_php.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSystemTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetSystemTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetSystemTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetSystemTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse doGetTransactionsIDs(pl.allegro.webapi.service_php.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetTransactionsIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetUserIDResponse doGetUserID(pl.allegro.webapi.service_php.DoGetUserIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetUserIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetUserIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetUserIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetUserItemsResponse doGetUserItems(pl.allegro.webapi.service_php.DoGetUserItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetUserItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetUserItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetUserItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse doGetUserLicenceDate(pl.allegro.webapi.service_php.DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetUserLoginResponse doGetUserLogin(pl.allegro.webapi.service_php.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetUserLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetUserLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetUserLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(pl.allegro.webapi.service_php.DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacksCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse doInternalIStoreChange(pl.allegro.webapi.service_php.DoInternalIStoreChangeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doInternalIStoreChange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doInternalIStoreChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoLoginResponse doLogin(pl.allegro.webapi.service_php.DoLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoLoginEncResponse doLoginEnc(pl.allegro.webapi.service_php.DoLoginEncRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginEnc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoLoginEncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoLoginEncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoLoginEncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMakeDiscountResponse doMakeDiscount(pl.allegro.webapi.service_php.DoMakeDiscountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMakeDiscount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMakeDiscount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMakeDiscountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMakeDiscountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMakeDiscountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse doMakeDiscountByCoupon(pl.allegro.webapi.service_php.DoMakeDiscountByCouponRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMakeDiscountByCoupon");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMakeDiscountByCoupon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyAccount2Response doMyAccount2(pl.allegro.webapi.service_php.DoMyAccount2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccount2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyAccount2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyAccount2Response) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyAccount2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse doMyAccountItemsCount(pl.allegro.webapi.service_php.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccountItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyBillingResponse doMyBilling(pl.allegro.webapi.service_php.DoMyBillingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyBillingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyBillingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyBillingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyBillingItemResponse doMyBillingItem(pl.allegro.webapi.service_php.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBillingItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyBillingItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyBillingItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyBillingItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyContactResponse doMyContact(pl.allegro.webapi.service_php.DoMyContactRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyContactResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyContactResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyContactResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyFeedback2Response doMyFeedback2(pl.allegro.webapi.service_php.DoMyFeedback2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyFeedback2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyFeedback2Response) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyFeedback2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse doMyFeedback2Limit(pl.allegro.webapi.service_php.DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2Limit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoNewAuctionExtResponse doNewAuctionExt(pl.allegro.webapi.service_php.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse doQueryAllSysStatus(pl.allegro.webapi.service_php.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQueryAllSysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoQuerySysStatusResponse doQuerySysStatus(pl.allegro.webapi.service_php.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQuerySysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoQuerySysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoQuerySysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoQuerySysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse doRemoveFromBlackList(pl.allegro.webapi.service_php.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse doRemoveFromWatchList(pl.allegro.webapi.service_php.DoRemoveFromWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse doRemoveItemTemplates(pl.allegro.webapi.service_php.DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoRequestCancelBidResponse doRequestCancelBid(pl.allegro.webapi.service_php.DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestCancelBid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoRequestCancelBidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoRequestCancelBidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoRequestCancelBidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoRequestPayoutResponse doRequestPayout(pl.allegro.webapi.service_php.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestPayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoRequestPayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoRequestPayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoRequestPayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoRequestSurchargeResponse doRequestSurcharge(pl.allegro.webapi.service_php.DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestSurcharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoRequestSurchargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoRequestSurchargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoRequestSurchargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSearchResponse doSearch(pl.allegro.webapi.service_php.DoSearchRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSellSomeAgainResponse doSellSomeAgain(pl.allegro.webapi.service_php.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSellSomeAgainResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSellSomeAgainResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSellSomeAgainResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(pl.allegro.webapi.service_php.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgainInShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSendEmailToUserResponse doSendEmailToUser(pl.allegro.webapi.service_php.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendEmailToUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSendEmailToUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSendEmailToUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSendEmailToUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSendPostBuyFormResponse doSendPostBuyForm(pl.allegro.webapi.service_php.DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSendPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSendPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSendPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSendRefundFormsResponse doSendRefundForms(pl.allegro.webapi.service_php.DoSendRefundFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendRefundForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSendRefundFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSendRefundFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSendRefundFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSendReminderMessagesResponse doSendReminderMessages(pl.allegro.webapi.service_php.DoSendReminderMessagesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendReminderMessages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendReminderMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSendReminderMessagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSendReminderMessagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSendReminderMessagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(pl.allegro.webapi.service_php.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse doSetUserLicenceDate(pl.allegro.webapi.service_php.DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoShowCatResponse doShowCat(pl.allegro.webapi.service_php.DoShowCatRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowCat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowCat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoShowCatResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoShowCatResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoShowCatResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoShowItemInfoExtResponse doShowItemInfoExt(pl.allegro.webapi.service_php.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowItemInfoExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoShowItemInfoExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoShowItemInfoExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoShowItemInfoExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoShowUserResponse doShowUser(pl.allegro.webapi.service_php.DoShowUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoShowUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoShowUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoShowUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoShowUserPageResponse doShowUserPage(pl.allegro.webapi.service_php.DoShowUserPageRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUserPage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUserPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoShowUserPageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoShowUserPageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoShowUserPageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.allegro.webapi.service_php.DoVerifyItemResponse doVerifyItem(pl.allegro.webapi.service_php.DoVerifyItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doVerifyItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.allegro.webapi.service_php.DoVerifyItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.allegro.webapi.service_php.DoVerifyItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.allegro.webapi.service_php.DoVerifyItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
