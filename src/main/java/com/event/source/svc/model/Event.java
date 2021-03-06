package com.event.source.svc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	
	private String id;
	@NotBlank(message = "Event name cannot be null or empty.")
	private String type;
	private String status;
	@NotBlank(message = "EntityId cannot be null or empty.")
	private String entityId;
	private long createdTime;
	@NotNull(message = "Event payload cannot be null or empty.")
	private Object payload;
}
