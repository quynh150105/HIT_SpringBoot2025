package com.example.BTVN_Buoi6.base.VsResponseUtil;

import com.example.BTVN_Buoi6.base.RestData.RestData;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class VsResponseUtil {

    public static ResponseEntity<RestData<?>> success(HttpStatus status, Object data){
        RestData<?> response = new RestData<>(data);
        return new ResponseEntity<>(response,status);
    }

    public static ResponseEntity<RestData<?>> success(MultiValueMap<String, String> header, Object data){
        return  success(HttpStatus.OK, header, data);
    }

    public static ResponseEntity<RestData<?>> success(HttpStatus status, MultiValueMap<String, String> header, Object data){
        RestData<?> response = new RestData<>(data);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.addAll(header);
        return ResponseEntity.ok().header(responseHeaders).body(response);
    }

    public static ResponseEntity<RestData<?>> error(HttpStatus status, Object message){
        RestData<?> response = RestData.error(message);
        return new ResponseEntity<>(response,status);
    }

}
