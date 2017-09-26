package com.thiagolvlsantos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@CrossOrigin
@RestController
@RequestMapping("/echo")
public class EchoController {

	private int serial = 0;

	@RequestMapping
	public ResponseEntity<Message> echo(@RequestParam(name = "msg", defaultValue = "type something") String msg) {
		return ResponseEntity.ok(new Message(serial++, msg.toUpperCase()));
	}

	@Data
	public static class Message {
		private int id;
		private String msg;

		public Message() {
		}

		public Message(int id, String msg) {
			this.id = id;
			this.msg = msg;
		}
	}
}
