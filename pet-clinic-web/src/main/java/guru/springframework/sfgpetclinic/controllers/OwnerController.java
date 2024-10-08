package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** Created by jt on 7/22/18. */
@RequestMapping("/owners")
@Controller
@AllArgsConstructor
public class OwnerController {
  private final OwnerService ownerService;

  @RequestMapping({"", "/", "/index", "/index.html"})
  public String listOwners(Model model) {

    model.addAttribute("owners", ownerService.findAll());

    return "owners/index";
  }
}
