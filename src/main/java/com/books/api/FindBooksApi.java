/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.books.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.books.model.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-29T11:16:10.424Z[GMT]")
@Api(value = "findBooks", description = "the findBooks API")
public interface FindBooksApi {

	@ApiOperation(value = "searches books", nickname = "findBooks", notes = "By passing in the appropriate options, you can search for available books in the system ", response = Book.class, responseContainer = "List", tags = {
			"findBooks", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "search results matching criteria", response = Book.class),
			@ApiResponse(code = 400, message = "bad input parameter") })
	@RequestMapping(value = "/findBooks/{searchValue}", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Book> findBooks(
			@ApiParam(value = "search value", required = true) @PathVariable("searchValue") String searchValue,
			@ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = false) String filter,
			@ApiParam(value = "language", required = false) @RequestParam(value = "language", required = false) String language,
			@ApiParam(value = "download", required = false) @RequestParam(value = "download", required = false) String download,
			@ApiParam(value = "maxResults", required = false) @RequestParam(value = "maxResults", required = false) String maxResults,
			@ApiParam(value = "printType", required = false) @RequestParam(value = "printType", required = false) String printType,
			@ApiParam(value = "orderBy", required = false) @RequestParam(value = "orderBy", required = false) String orderBy);

}
