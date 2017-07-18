package aQute.openapi.security.api;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface OpenAPISecurityProvider {

	/**
	 * Mandatory name as used in Open API
	 * TODO
	 */
	String	NAME	= "openapi.name";
	/**
	 * Mandatory base path as used in Open API
	 */
	String	BASE	= "openapi.base";

	/**
	 * Create an authentication object for verifying the authentication state
	 * machine.
	 *
	 * @param context
	 *            the current context
	 * @param dto
	 *            the security definition
	 * @return an Authentication
	 */
	Authentication authenticate(HttpServletRequest request, HttpServletResponse response,
			OpenAPISecurityDefinition dto);

	default URI login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return null;
	}

	default URI other(String command, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return null;
	};

	default URI logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return null;
	}

	default OpenAPISecurityProviderInfo getInfo(HttpServletRequest request) throws Exception {
		return null;
	}
}
