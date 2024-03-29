package com.example.oblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class førstController {
    public class billett {
        private String antall;
        private String fornavn;
        private String etternavn;
        private String epost;
        private int telefonnr;

        public billett(String antall, String fornavn, String etternavn, String epost, int telefonnr) {
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.epost = epost;
            this.telefonnr = telefonnr;
        }

        public billett() {
        }

        public String getAntall() {
            return antall;
        }

        public void setAntall(String antall) {
            this.antall = antall;
        }

        public String getFornavn() {
            return fornavn;
        }

        public void setFornavn(String fornavn) {
            this.fornavn = fornavn;
        }

        public String getEtternavn() {
            return etternavn;
        }

        public void setEtternavn(String etternavn) {
            this.etternavn = etternavn;
        }

        public String getEpost() {
            return epost;
        }

        public void setEpost(String epost) {
            this.epost = epost;
        }

        public int getTelefonnr() {
            return telefonnr;
        }

        public void setTelefonnr(int telefonnr) {
            this.telefonnr = telefonnr;
        }

    }
    private final List<billett>allebilletter=new ArrayList<>();
    @GetMapping  ("/kjøpt")
        public void billettkjøpt(billett nybillett){
        allebilletter.add(nybillett);
    }


}


