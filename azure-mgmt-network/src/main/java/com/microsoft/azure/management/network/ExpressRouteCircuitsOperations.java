/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ExpressRouteCircuit;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitArpTable;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitRoutesTable;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitStats;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteCircuitsOperations.
 */
public interface ExpressRouteCircuitsOperations {
    /**
     * The interface defining all the services for ExpressRouteCircuitsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRouteCircuitsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Body ExpressRouteCircuit parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/arpTable")
        Call<ResponseBody> listArpTable(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/routesTable")
        Call<ResponseBody> listRoutesTable(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/stats")
        Call<ResponseBody> listStats(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/expressRouteCircuits")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listArpTableNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listRoutesTableNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listStatsNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The delete ExpressRouteCircuit operation deletes the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route Circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String circuitName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete ExpressRouteCircuit operation deletes the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route Circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String circuitName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get ExpressRouteCircuit operation retreives information about the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuit object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ExpressRouteCircuit> get(String resourceGroupName, String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ExpressRouteCircuit operation retreives information about the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String circuitName, final ServiceCallback<ExpressRouteCircuit> serviceCallback);

    /**
     * The Put ExpressRouteCircuit operation creates/updates a ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create/delete ExpressRouteCircuit operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ExpressRouteCircuit object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ExpressRouteCircuit> createOrUpdate(String resourceGroupName, String circuitName, ExpressRouteCircuit parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put ExpressRouteCircuit operation creates/updates a ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create/delete ExpressRouteCircuit operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String circuitName, ExpressRouteCircuit parameters, final ServiceCallback<ExpressRouteCircuit> serviceCallback);

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitArpTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitArpTable>> listArpTable(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listArpTableAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitArpTable> serviceCallback);

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitRoutesTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitRoutesTable>> listRoutesTable(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listRoutesTableAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitRoutesTable> serviceCallback);

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the loadBalancer.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitStats&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitStats>> listStats(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the loadBalancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listStatsAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitStats> serviceCallback);

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ExpressRouteCircuit>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(final String resourceGroupName, final ListOperationCallback<ExpressRouteCircuit> serviceCallback);

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ExpressRouteCircuit>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ListOperationCallback<ExpressRouteCircuit> serviceCallback);

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitArpTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitArpTable>> listArpTableNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listArpTableNextAsync(final String nextPageLink, final ListOperationCallback<ExpressRouteCircuitArpTable> serviceCallback);

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitRoutesTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitRoutesTable>> listRoutesTableNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listRoutesTableNextAsync(final String nextPageLink, final ListOperationCallback<ExpressRouteCircuitRoutesTable> serviceCallback);

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitStats&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitStats>> listStatsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listStatsNextAsync(final String nextPageLink, final ListOperationCallback<ExpressRouteCircuitStats> serviceCallback);

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuit>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(final String nextPageLink, final ListOperationCallback<ExpressRouteCircuit> serviceCallback);

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuit>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(final String nextPageLink, final ListOperationCallback<ExpressRouteCircuit> serviceCallback);

}
