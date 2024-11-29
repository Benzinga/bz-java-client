/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.benzinga.BZClient.utils.Options;

public class SDKMethodInterfaces {


    public interface MethodCallGetAnalystReportsRawTextData {
        GetAnalystReportsRawTextDataResponse get(
            Optional<Long> page,
            Optional<Long> pagesize,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAnalystInsightsV1 {
        GetAnalystInsightsV1Response get(
            GetAnalystInsightsV1Request request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetIposV21 {
        GetIposV21Response getV21(
            GetIposV21Request request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetIposV2 {
        GetIposV2Response get(
            GetIposV2Request request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDividendsV22 {
        GetDividendsV22Response getV22(
            GetDividendsV22Request request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDividends {
        GetDividendsResponse get(
            GetDividendsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBullsSayBearsSayV1 {
        GetBullsSayBearsSayV1Response get(
            Optional<String> symbols,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetRemoved {
        GetRemovedResponse get(
            Optional<Long> page,
            Optional<Long> pageSize,
            Optional<? extends Type> type,
            Optional<Long> updated,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConferenceCalls {
        GetConferenceCallsResponse get(
            GetConferenceCallsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEarnings {
        GetEarningsResponse get(
            GetEarningsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEconomics {
        GetEconomicsResponse get(
            GetEconomicsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEvents {
        GetEventsResponse get(
            GetEventsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetFda {
        GetFdaResponse get(
            GetFdaRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetGuidance {
        GetGuidanceResponse get(
            GetGuidanceRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetMa {
        GetMaResponse get(
            GetMaRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetOfferings {
        GetOfferingsResponse get(
            GetOfferingsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetRatings {
        GetRatingsResponse get(
            GetRatingsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetRatingsAnalysts {
        GetRatingsAnalystsResponse get(
            GetRatingsAnalystsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetRatingsFirms {
        GetRatingsFirmsResponse get(
            GetRatingsFirmsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSplits {
        GetSplitsResponse get(
            GetSplitsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConsensusRatingsV1 {
        GetConsensusRatingsV1Response get(
            GetConsensusRatingsV1Request request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetGovernmentTradeReports {
        GetGovernmentTradeReportsResponse get(
            GetGovernmentTradeReportsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetGovernmentTrades {
        GetGovernmentTradesResponse get(
            GetGovernmentTradesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetInsiderTransaction {
        GetInsiderTransactionResponse get(
            GetInsiderTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetInsiderTransactionOwner {
        GetInsiderTransactionOwnerResponse getOwner(
            GetInsiderTransactionOwnerRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetOptionActivityV1 {
        GetOptionActivityV1Response get(
            GetOptionActivityV1Request request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetQuoteDelayedV1 {
        GetQuoteDelayedV1Response getV1(
            Optional<String> symbols,
            Optional<String> isin,
            Optional<String> cik,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetFundamentalsV21 {
        GetFundamentalsV21Response getV21(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAlphaBetaV21 {
        GetAlphaBetaV21Response getAlphaBeta(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompanyV21 {
        GetCompanyV21Response getCompanyV21(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompanyProfileV21 {
        GetCompanyProfileV21Response getCompanyProfileV21(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetShareClassV21 {
        GetShareClassV21Response getShareClass(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetShareClassProfileV21 {
        GetShareClassProfileV21Response getShareClassProfile(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetFundamentalsV2 {
        GetFundamentalsV2Response get(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAssetClassificationV21 {
        GetAssetClassificationV21Response getAssetClassification(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEarningsReportsV21 {
        GetEarningsReportsV21Response getEarningsReports(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetFinancialsV21 {
        GetFinancialsV21Response getFinancialsV21(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetFundamentalsV3 {
        GetFundamentalsV3Response getV3(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBalanceSheetV3 {
        GetBalanceSheetV3Response getBalanceSheetV3(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCashFlowV3 {
        GetCashFlowV3Response getCashFlowV3(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetIncomeStatementV3 {
        GetIncomeStatementV3Response getIncomeStatement(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSharePriceRatiosV3 {
        GetSharePriceRatiosV3Response getSharePriceRatios(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBarsV2 {
        GetBarsV2Response get(
            String symbols,
            String from,
            Optional<String> to,
            Optional<String> interval,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEarningRatiosV21 {
        GetEarningRatiosV21Response get(
            Optional<String> symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetOperationRatiosV21 {
        GetOperationRatiosV21Response get(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetValuationRatiosV21 {
        GetValuationRatiosV21Response get(
            Optional<String> symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetQuoteDelayedV2 {
        GetQuoteDelayedV2Response get(
            Optional<String> symbols,
            Optional<String> isin,
            Optional<String> cik,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDerivedFiguresAndRatiosV3 {
        GetDerivedFiguresAndRatiosV3Response get(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEarningsCallTranscripts {
        GetEarningsCallTranscriptsResponse get(
            Optional<? extends List<String>> tickers,
            Optional<? extends List<String>> callId,
            Optional<Long> page,
            Optional<Long> pagesize,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetEarningsCallTranscriptAudioFiles {
        GetEarningsCallTranscriptAudioFilesResponse getAudio(
            Optional<? extends List<String>> tickers,
            Optional<? extends List<String>> callId,
            Optional<Long> page,
            Optional<Long> pagesize,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallLogoBulkSync {
        LogoBulkSyncResponse bulkSync(
            LogoBulkSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSearchLogos {
        GetSearchLogosResponse search(
            GetSearchLogosRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetNews {
        GetNewsResponse get(
            GetNewsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetRemovedNews {
        GetRemovedNewsResponse getRemoved(
            Optional<String> updatedSince,
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetNewsquantifiedData {
        GetNewsquantifiedDataResponse get(
            GetNewsquantifiedDataRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetTickerTrendData {
        GetTickerTrendDataResponse get(
            GetTickerTrendDataRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetTickerTrendListData {
        GetTickerTrendListDataResponse getList(
            GetTickerTrendListDataRequest request,
            Optional<Options> options) throws Exception;
    }


}
