package com.bothikigai.stelweb.stel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SitePageController {

    @GetMapping("/")
    public String landinPage() {
        return "index";
    }

    @GetMapping("/ingresar")
    public String ingresarPage() {
        return "ingresar";
    }

    @GetMapping("/mapa")
    public String mapaPage() {
        return "mapa";
    }

    @GetMapping("/recoverPassword")
    public String recoverPasswordPage(){
        return "recoverPassword";
    }

    @GetMapping("/paginascomplementarias")
    public String paginaComplementariaPage(){
        return  "paginascomplementarias";
    }

    @GetMapping("/politicaprivacidad")
    public String politicaPrivacidadPage() {
        return "politicaprivacidad";
    }

    @GetMapping("/servicios")
    public String serviciosPage() {
        return "servicios";
    }

    @GetMapping("/sobrenosotros")
    public String sobreNosotrosPage() {
        return "sobrenosotros";
    }

    @GetMapping("contactenos")
    public String contactenosPage() {
        return "contactenos";
    }

    // ERRO PAGE //

    @GetMapping("/error404")
    public String error404Page() { return "error404"; }


}

