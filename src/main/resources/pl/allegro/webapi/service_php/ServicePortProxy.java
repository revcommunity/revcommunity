package pl.allegro.webapi.service_php;

public class ServicePortProxy implements pl.allegro.webapi.service_php.ServicePort {
  private String _endpoint = null;
  private pl.allegro.webapi.service_php.ServicePort servicePort = null;
  
  public ServicePortProxy() {
    _initServicePortProxy();
  }
  
  public ServicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicePortProxy();
  }
  
  private void _initServicePortProxy() {
    try {
      servicePort = (new pl.allegro.webapi.service_php.ServiceServiceLocator()).getservicePort();
      if (servicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicePort != null)
      ((javax.xml.rpc.Stub)servicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pl.allegro.webapi.service_php.ServicePort getServicePort() {
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort;
  }
  
  public pl.allegro.webapi.service_php.DoAddDescToItemsResponse doAddDescToItems(pl.allegro.webapi.service_php.DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddDescToItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(pl.allegro.webapi.service_php.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddPackageInfoToPostBuyForm(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoAddToBlackListResponse doAddToBlackList(pl.allegro.webapi.service_php.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddToBlackList(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoAddToWatchListResponse doAddToWatchList(pl.allegro.webapi.service_php.DoAddToWatchListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doAddToWatchList(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoBidItemResponse doBidItem(pl.allegro.webapi.service_php.DoBidItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doBidItem(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCancelBidItemResponse doCancelBidItem(pl.allegro.webapi.service_php.DoCancelBidItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelBidItem(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCancelRefundFormsResponse doCancelRefundForms(pl.allegro.webapi.service_php.DoCancelRefundFormsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelRefundForms(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCancelRefundWarningsResponse doCancelRefundWarnings(pl.allegro.webapi.service_php.DoCancelRefundWarningsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelRefundWarnings(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCancelTransactionResponse doCancelTransaction(pl.allegro.webapi.service_php.DoCancelTransactionRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCancelTransaction(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoChangeItemFieldsResponse doChangeItemFields(pl.allegro.webapi.service_php.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doChangeItemFields(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoChangePriceItemResponse doChangePriceItem(pl.allegro.webapi.service_php.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doChangePriceItem(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoChangeQuantityItemResponse doChangeQuantityItem(pl.allegro.webapi.service_php.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doChangeQuantityItem(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCheckExternalKeyResponse doCheckExternalKey(pl.allegro.webapi.service_php.DoCheckExternalKeyRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCheckExternalKey(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCheckItemDescriptionResponse doCheckItemDescription(pl.allegro.webapi.service_php.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCheckItemDescription(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(pl.allegro.webapi.service_php.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCheckNewAuctionExt(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoCreateItemTemplateResponse doCreateItemTemplate(pl.allegro.webapi.service_php.DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doCreateItemTemplate(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoFeedbackResponse doFeedback(pl.allegro.webapi.service_php.DoFeedbackRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFeedback(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoFeedbackManyResponse doFeedbackMany(pl.allegro.webapi.service_php.DoFeedbackManyRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFeedbackMany(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoFinishItemResponse doFinishItem(pl.allegro.webapi.service_php.DoFinishItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFinishItem(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoFinishItemsResponse doFinishItems(pl.allegro.webapi.service_php.DoFinishItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doFinishItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(pl.allegro.webapi.service_php.DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetAdminUserLicenceDate(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetBidItem2Response doGetBidItem2(pl.allegro.webapi.service_php.DoGetBidItem2Request parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetBidItem2(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetBlackListUsersResponse doGetBlackListUsers(pl.allegro.webapi.service_php.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetBlackListUsers(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetCategoryPathResponse doGetCategoryPath(pl.allegro.webapi.service_php.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCategoryPath(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetCatsDataResponse doGetCatsData(pl.allegro.webapi.service_php.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCatsData(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetCatsDataCountResponse doGetCatsDataCount(pl.allegro.webapi.service_php.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCatsDataCount(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetCatsDataLimitResponse doGetCatsDataLimit(pl.allegro.webapi.service_php.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCatsDataLimit(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetCountriesResponse doGetCountries(pl.allegro.webapi.service_php.DoGetCountriesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetCountries(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetDealsResponse doGetDeals(pl.allegro.webapi.service_php.DoGetDealsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetDeals(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetFavouriteCategoriesResponse doGetFavouriteCategories(pl.allegro.webapi.service_php.DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFavouriteCategories(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetFavouriteSellersResponse doGetFavouriteSellers(pl.allegro.webapi.service_php.DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFavouriteSellers(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetFeedbackResponse doGetFeedback(pl.allegro.webapi.service_php.DoGetFeedbackRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFeedback(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(pl.allegro.webapi.service_php.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetFilledPostBuyForms(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetItemFieldsResponse doGetItemFields(pl.allegro.webapi.service_php.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemFields(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetItemTemplatesResponse doGetItemTemplates(pl.allegro.webapi.service_php.DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemTemplates(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetItemsImagesResponse doGetItemsImages(pl.allegro.webapi.service_php.DoGetItemsImagesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemsImages(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetItemsInfoResponse doGetItemsInfo(pl.allegro.webapi.service_php.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemsInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetItemsListResponse doGetItemsList(pl.allegro.webapi.service_php.DoGetItemsListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetItemsList(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMessageToBuyerResponse doGetMessageToBuyer(pl.allegro.webapi.service_php.DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMessageToBuyer(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyAddressesResponse doGetMyAddresses(pl.allegro.webapi.service_php.DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyAddresses(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyBidItemsResponse doGetMyBidItems(pl.allegro.webapi.service_php.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyBidItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(pl.allegro.webapi.service_php.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyCurrentShipmentPriceType(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyDataResponse doGetMyData(pl.allegro.webapi.service_php.DoGetMyDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyData(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyFutureItemsResponse doGetMyFutureItems(pl.allegro.webapi.service_php.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyFutureItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyIncomingPayments(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(pl.allegro.webapi.service_php.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyIncomingPaymentsRefunds(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(pl.allegro.webapi.service_php.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyNotSoldItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyNotWonItemsResponse doGetMyNotWonItems(pl.allegro.webapi.service_php.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyNotWonItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyPaymentsResponse doGetMyPayments(pl.allegro.webapi.service_php.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPayments(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(pl.allegro.webapi.service_php.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPaymentsInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(pl.allegro.webapi.service_php.DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPaymentsRefunds(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyPayoutsResponse doGetMyPayouts(pl.allegro.webapi.service_php.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyPayouts(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMySellItemsResponse doGetMySellItems(pl.allegro.webapi.service_php.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMySellItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMySellRatingResponse doGetMySellRating(pl.allegro.webapi.service_php.DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMySellRating(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMySoldItemsResponse doGetMySoldItems(pl.allegro.webapi.service_php.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMySoldItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyWatchItemsResponse doGetMyWatchItems(pl.allegro.webapi.service_php.DoGetMyWatchItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyWatchItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyWatchedItemsResponse doGetMyWatchedItems(pl.allegro.webapi.service_php.DoGetMyWatchedItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyWatchedItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetMyWonItemsResponse doGetMyWonItems(pl.allegro.webapi.service_php.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetMyWonItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPaymentDataResponse doGetPaymentData(pl.allegro.webapi.service_php.DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPaymentData(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPaymentMethodsResponse doGetPaymentMethods(pl.allegro.webapi.service_php.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPaymentMethods(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPostBuyDataResponse doGetPostBuyData(pl.allegro.webapi.service_php.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyData(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyFormsDataForBuyers(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(pl.allegro.webapi.service_php.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyFormsDataForSellers(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(pl.allegro.webapi.service_php.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyFormsIds(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(pl.allegro.webapi.service_php.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetPostBuyItemInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetRefundFormsStatusesResponse doGetRefundFormsStatuses(pl.allegro.webapi.service_php.DoGetRefundFormsStatusesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRefundFormsStatuses(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetRefundReasonsResponse doGetRefundReasons(pl.allegro.webapi.service_php.DoGetRefundReasonsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRefundReasons(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetRefundTransactionsResponse doGetRefundTransactions(pl.allegro.webapi.service_php.DoGetRefundTransactionsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRefundTransactions(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetRelatedItemsResponse doGetRelatedItems(pl.allegro.webapi.service_php.DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetRelatedItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse doGetSellFormAttribs(pl.allegro.webapi.service_php.DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormAttribs(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellFormFieldsResponse doGetSellFormFields(pl.allegro.webapi.service_php.DoGetSellFormFieldsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFields(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(pl.allegro.webapi.service_php.DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsExt(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(pl.allegro.webapi.service_php.DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsExtLimit(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(pl.allegro.webapi.service_php.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsForCategory(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitResponse doGetSellFormFieldsLimit(pl.allegro.webapi.service_php.DoGetSellFormFieldsLimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellFormFieldsLimit(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSellRatingReasonsResponse doGetSellRatingReasons(pl.allegro.webapi.service_php.DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSellRatingReasons(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetServiceInfoResponse doGetServiceInfo(pl.allegro.webapi.service_php.DoGetServiceInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetServiceInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesResponse doGetServiceInfoCategories(pl.allegro.webapi.service_php.DoGetServiceInfoCategoriesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetServiceInfoCategories(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetServiceTemplatesResponse doGetServiceTemplates(pl.allegro.webapi.service_php.DoGetServiceTemplatesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetServiceTemplates(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetResponse doGetSessionHandleForWidget(pl.allegro.webapi.service_php.DoGetSessionHandleForWidgetRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSessionHandleForWidget(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetShipmentDataResponse doGetShipmentData(pl.allegro.webapi.service_php.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShipmentData(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(pl.allegro.webapi.service_php.DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShipmentDataForRelatedItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(pl.allegro.webapi.service_php.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShipmentPriceTypes(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetShopCatsDataResponse doGetShopCatsData(pl.allegro.webapi.service_php.DoGetShopCatsDataRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetShopCatsData(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSiteJournalResponse doGetSiteJournal(pl.allegro.webapi.service_php.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournal(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(pl.allegro.webapi.service_php.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournalDeals(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(pl.allegro.webapi.service_php.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournalDealsInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(pl.allegro.webapi.service_php.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSiteJournalInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSitesFlagInfoResponse doGetSitesFlagInfo(pl.allegro.webapi.service_php.DoGetSitesFlagInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSitesFlagInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSitesInfoResponse doGetSitesInfo(pl.allegro.webapi.service_php.DoGetSitesInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSitesInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSpecialItemsResponse doGetSpecialItems(pl.allegro.webapi.service_php.DoGetSpecialItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSpecialItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetStatesInfoResponse doGetStatesInfo(pl.allegro.webapi.service_php.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetStatesInfo(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetSystemTimeResponse doGetSystemTime(pl.allegro.webapi.service_php.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetSystemTime(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetTransactionsIDsResponse doGetTransactionsIDs(pl.allegro.webapi.service_php.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetTransactionsIDs(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetUserIDResponse doGetUserID(pl.allegro.webapi.service_php.DoGetUserIDRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserID(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetUserItemsResponse doGetUserItems(pl.allegro.webapi.service_php.DoGetUserItemsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserItems(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetUserLicenceDateResponse doGetUserLicenceDate(pl.allegro.webapi.service_php.DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserLicenceDate(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetUserLoginResponse doGetUserLogin(pl.allegro.webapi.service_php.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetUserLogin(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(pl.allegro.webapi.service_php.DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetWaitingFeedbacks(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(pl.allegro.webapi.service_php.DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doGetWaitingFeedbacksCount(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoInternalIStoreChangeResponse doInternalIStoreChange(pl.allegro.webapi.service_php.DoInternalIStoreChangeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doInternalIStoreChange(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoLoginResponse doLogin(pl.allegro.webapi.service_php.DoLoginRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doLogin(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoLoginEncResponse doLoginEnc(pl.allegro.webapi.service_php.DoLoginEncRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doLoginEnc(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMakeDiscountResponse doMakeDiscount(pl.allegro.webapi.service_php.DoMakeDiscountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMakeDiscount(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMakeDiscountByCouponResponse doMakeDiscountByCoupon(pl.allegro.webapi.service_php.DoMakeDiscountByCouponRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMakeDiscountByCoupon(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyAccount2Response doMyAccount2(pl.allegro.webapi.service_php.DoMyAccount2Request parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyAccount2(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyAccountItemsCountResponse doMyAccountItemsCount(pl.allegro.webapi.service_php.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyAccountItemsCount(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyBillingResponse doMyBilling(pl.allegro.webapi.service_php.DoMyBillingRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyBilling(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyBillingItemResponse doMyBillingItem(pl.allegro.webapi.service_php.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyBillingItem(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyContactResponse doMyContact(pl.allegro.webapi.service_php.DoMyContactRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyContact(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyFeedback2Response doMyFeedback2(pl.allegro.webapi.service_php.DoMyFeedback2Request parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyFeedback2(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoMyFeedback2LimitResponse doMyFeedback2Limit(pl.allegro.webapi.service_php.DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doMyFeedback2Limit(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoNewAuctionExtResponse doNewAuctionExt(pl.allegro.webapi.service_php.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doNewAuctionExt(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoQueryAllSysStatusResponse doQueryAllSysStatus(pl.allegro.webapi.service_php.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doQueryAllSysStatus(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoQuerySysStatusResponse doQuerySysStatus(pl.allegro.webapi.service_php.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doQuerySysStatus(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoRemoveFromBlackListResponse doRemoveFromBlackList(pl.allegro.webapi.service_php.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRemoveFromBlackList(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoRemoveFromWatchListResponse doRemoveFromWatchList(pl.allegro.webapi.service_php.DoRemoveFromWatchListRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRemoveFromWatchList(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoRemoveItemTemplatesResponse doRemoveItemTemplates(pl.allegro.webapi.service_php.DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRemoveItemTemplates(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoRequestCancelBidResponse doRequestCancelBid(pl.allegro.webapi.service_php.DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRequestCancelBid(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoRequestPayoutResponse doRequestPayout(pl.allegro.webapi.service_php.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRequestPayout(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoRequestSurchargeResponse doRequestSurcharge(pl.allegro.webapi.service_php.DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doRequestSurcharge(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSearchResponse doSearch(pl.allegro.webapi.service_php.DoSearchRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSearch(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSellSomeAgainResponse doSellSomeAgain(pl.allegro.webapi.service_php.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSellSomeAgain(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(pl.allegro.webapi.service_php.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSellSomeAgainInShop(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSendEmailToUserResponse doSendEmailToUser(pl.allegro.webapi.service_php.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendEmailToUser(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSendPostBuyFormResponse doSendPostBuyForm(pl.allegro.webapi.service_php.DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendPostBuyForm(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSendRefundFormsResponse doSendRefundForms(pl.allegro.webapi.service_php.DoSendRefundFormsRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendRefundForms(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSendReminderMessagesResponse doSendReminderMessages(pl.allegro.webapi.service_php.DoSendReminderMessagesRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSendReminderMessages(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(pl.allegro.webapi.service_php.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSetShipmentPriceType(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoSetUserLicenceDateResponse doSetUserLicenceDate(pl.allegro.webapi.service_php.DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doSetUserLicenceDate(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoShowCatResponse doShowCat(pl.allegro.webapi.service_php.DoShowCatRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowCat(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoShowItemInfoExtResponse doShowItemInfoExt(pl.allegro.webapi.service_php.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowItemInfoExt(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoShowUserResponse doShowUser(pl.allegro.webapi.service_php.DoShowUserRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowUser(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoShowUserPageResponse doShowUserPage(pl.allegro.webapi.service_php.DoShowUserPageRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doShowUserPage(parameters);
  }
  
  public pl.allegro.webapi.service_php.DoVerifyItemResponse doVerifyItem(pl.allegro.webapi.service_php.DoVerifyItemRequest parameters) throws java.rmi.RemoteException{
    if (servicePort == null)
      _initServicePortProxy();
    return servicePort.doVerifyItem(parameters);
  }
  
  
}