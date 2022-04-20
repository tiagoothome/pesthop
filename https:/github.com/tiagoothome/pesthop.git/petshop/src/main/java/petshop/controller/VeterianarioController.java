package petshop.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import petshop.model.Veterinario;

@Controller
public class VeterianarioController {
	@GetMapping("/CadastroVeterinario")
	public String formCadastroVeterinario(Model model) {
		Veterinario veterinario = new Veterinario();
		model.addAttribute("veterinario", veterinario);	
		return "veterinario";
		}
	
	@PostMapping("/CadastroVeterinario")
	public String recebeVeterinario(@ModelAttribute("veterinario")Veterinario veterinario, Model model) {
		ArrayList<Veterinario> lista = new ArrayList<>();
		
		Veterinario veterinario1 = new Veterinario(1, "João", "123455", "Cardiologista");
		
		lista.add(veterinario1);
		
		lista.add(veterinario);
		
		model.addAttribute("lista", lista);
		return "relatorio";
	}

}
