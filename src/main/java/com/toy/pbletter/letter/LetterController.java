package com.toy.pbletter.letter;

import com.toy.pbletter.user.UserFeign;
import com.toy.pbletter.user.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/letter")
@RequiredArgsConstructor
@Log4j2
@CrossOrigin
@Api(tags = {"Letter API V1"})
public class LetterController {

    private final UserFeign userFeign;

    @GetMapping("/user")
    @ApiOperation(value = "User Test")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok(userFeign.getYaho2());
    }

    @GetMapping("/test")
    @ApiOperation(value = "Letter Test")
    public ResponseEntity<String> getHello() {
        User user = userFeign.getUser();
        log.info("user :: " + user.getUid());
        return ResponseEntity.ok("Hello");
    }
}
