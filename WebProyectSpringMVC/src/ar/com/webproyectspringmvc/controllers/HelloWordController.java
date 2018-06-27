/**
 * 
 */
package ar.com.webproyectspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ACADEMIA
 *	<servidor>/hola --> va acceder a este control.
 *	
 */


@Controller
@RequestMapping("/hola")
public class HelloWordController {
	
	@RequestMapping("/mundo")
	public String message(){
		return "HolaMundo";
	}
}
