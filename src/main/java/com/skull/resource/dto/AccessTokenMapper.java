package com.skull.resource.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO for access token.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-10-11
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AccessTokenMapper {

	private String id;
	private String userName;
	private String name;

}
