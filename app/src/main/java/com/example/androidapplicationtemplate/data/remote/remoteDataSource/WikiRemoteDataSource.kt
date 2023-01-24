package com.example.androidapplicationtemplate.data.remote.remoteDataSource

import com.example.androidapplicationtemplate.data.models.response.Response
import com.example.androidapplicationtemplate.data.remote.remoteServices.WikiService
import javax.inject.Inject

class WikiRemoteDataSource @Inject constructor(
	private val wikiService: WikiService
) {

	suspend fun get(): Response {
		return wikiService.getWiki()
	}

}