package com.bothikigai.stelweb.stel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SitePageController {

    @GetMapping("/")
    public String landinPage() {
        return "/public/index";
    }

    @GetMapping("/ingresar")
    public String ingresarPage() {
        return "/public/ingresar";
    }

    @GetMapping("/mapa")
    public String mapaPage() {
        return "/public/mapa";
    }

    @GetMapping("/recoverPassword")
    public String recoverPasswordPage(){
        return "/public/recoverPassword";
    }

    @GetMapping("/paginascomplementarias")
    public String paginaComplementariaPage(){
        return  "/public/paginascomplementarias";
    }

    @GetMapping("/politicaprivacidad")
    public String politicaPrivacidadPage() {
        return "/public/politicaprivacidad";
    }

    @GetMapping("/servicios")
    public String serviciosPage() {
        return "/public/servicios";
    }

    @GetMapping("/sobrenosotros")
    public String sobreNosotrosPage() {
        return "/public/sobrenosotros";
    }

    @GetMapping("contactenos")
    public String contactenosPage() {
        return "/public/contactenos";
    }

    // ERRO PAGE //

    @GetMapping("/error404")
    public String error404Page() { return "/public/error404"; }


}

