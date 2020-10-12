package com.skull.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skull.resource.dto.AccessTokenMapper;

/**
 * Rest controller for project resources.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-10-11
 *
 */
@RestController
public class ProjectServiceController {

	@PreAuthorize("hasRole('PROJECT_NEW')")
	@RequestMapping(value = "/projects", method = RequestMethod.POST)
	public String createNote() {

		AccessTokenMapper accessTokenMapper = (AccessTokenMapper) ((OAuth2AuthenticationDetails) SecurityContextHolder
				.getContext().getAuthentication().getDetails()).getDecodedDetails();

		System.out.println("ID:" + accessTokenMapper.getId());
		System.out.println("Name:" + accessTokenMapper.getName());
		System.out.println("Email ID:" + accessTokenMapper.getUserName());

		return "OK for POST";
	}

	@PreAuthorize("hasRole('PROJECT_EDIT')")
	@RequestMapping(value = "/projects", method = RequestMethod.PUT)
	public String updateNote() {
		return "OK for PUT";
	}

	@PreAuthorize("hasRole('PROJECT_DELETE')")
	@RequestMapping(value = "/projects", method = RequestMethod.DELETE)
	public String deleteNote() {
		return "OK for DELETE";
	}

	@PreAuthorize("hasRole('PROJECT_VIEW_ALL')")
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String viewAllNotes() {
		return "OK for VIEW ALL";
	}

	@PreAuthorize("hasRole('PROJECT_VIEW')")
	@RequestMapping(value = "/projectById", method = RequestMethod.GET)
	public String viewNotesByID() {
		return "OK for VIEW";
	}

}
