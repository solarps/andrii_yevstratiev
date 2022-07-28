package org.epam.spring.homework4.HW4.service.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.epam.spring.homework4.HW4.service.model.enums.ErrorType;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class ServiceException extends RuntimeException {
  ErrorType errorType;

  public ServiceException(String message) {
    super(message);
  }

  public ErrorType getErrorType() {
    return ErrorType.FATAL_ERROR_TYPE;
  }
}