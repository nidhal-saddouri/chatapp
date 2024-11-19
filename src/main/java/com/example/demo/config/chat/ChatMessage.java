package com.example.demo.config.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String Content;
    private String sender;
    private Messagetype type;
}
