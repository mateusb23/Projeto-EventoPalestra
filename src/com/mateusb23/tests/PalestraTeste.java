package com.mateusb23.tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mateusb23.dao.PalestraDAO;
import com.mateusb23.modelo.Local;
import com.mateusb23.modelo.Palestra;
import com.mateusb23.modelo.Palestrante;

public class PalestraTeste {

	public static void main(String[] args) throws ParseException {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Palestrante palestrante1 = new Palestrante();
		palestrante1.setNome("Mateus Santos Bispo");
		palestrante1.setMiniBio("Software Developer");
		palestrante1.setMiniBio("Atualmente, é estudante de Java e, recentemente, trabalhou como analista de infraestrutura de TI.");
		
		List<Palestrante> palestrantes = new ArrayList<>();
		palestrantes.add(palestrante1);
		
		Local local = new Local();
		local.setPredio("Delta");
		local.setSala("D123");
		local.setCapacidade(60);
		
		Palestra palestra = new Palestra();
		palestra.setTitulo("O motivo pelo qual você não deve desistir de estudar programação");
		palestra.setLocal(local);
		palestra.setDuracao(100);
		palestra.setDataHora(df.parse("26/09/2014 19:00"));
		
		palestra.setPalestrantes(palestrantes);
		
		palestrante1.setPalestra(palestra);
		
		PalestraDAO dao = new PalestraDAO();
		
	}

}
