package com.project.oneshot.controller;

import com.project.oneshot.command.*;
import com.project.oneshot.inventory.purchase.PurchaseCriteria;
import com.project.oneshot.inventory.purchase.PurchasePageVO;
import com.project.oneshot.inventory.purchase.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/inventory")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchaseList")
    public String purchase(Model model, PurchaseCriteria cri) {
        System.out.println("cri = " + cri);
        List<PurchaseVO> list = purchaseService.getAllPurchase(cri);
        model.addAttribute("list", list);

        List<CategoryVO> categoryList = purchaseService.getAllCategories();
        model.addAttribute("categoryList", categoryList);

        int totalPurchase = purchaseService.getTotalPurchase(cri);
        PurchasePageVO pageVO = new PurchasePageVO(cri, totalPurchase);
        model.addAttribute("pageVO", pageVO);

        return "inventory/purchase";
    }

    @PostMapping("/registerPurchase")
    public String registerPurchase(@RequestParam("productNo") List<Integer> productNo,
                                   @RequestParam("purchasePrice") List<Integer> purchasePrice,
                                   @RequestParam("purchaseQuantity") List<Integer> purchaseQuantity,
                                   @RequestParam("employeeNo") int employeeNo) {
        List<PurchaseVO> list = new ArrayList<>();
        for(int i = 0; i < productNo.size(); i++) {
            PurchaseVO vo = new PurchaseVO();
            vo.setProductNo(productNo.get(i));
            vo.setPurchasePrice(purchasePrice.get(i));
            vo.setPurchaseQuantity(purchaseQuantity.get(i));
            vo.setEmployeeNo(employeeNo);
            System.out.println("vo = " + vo);
            list.add(vo);
        }
        purchaseService.registerPurchase(list);
        return "redirect:/inventory/purchaseList";
    }
}
