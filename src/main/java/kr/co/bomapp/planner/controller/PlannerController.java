package kr.co.bomapp.planner.controller;

import kr.co.bomapp.planner.service.PlannerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlannerController {

    private PlannerService plannerService;

    @GetMapping("/planners/{id}")
    public ResponseEntity<?> getPlannerInfo(@PathVariable String id) {

//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        return ResponseEntity.ok(plannerService.getPlannerInfo(id));
    }
}
