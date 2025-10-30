package de.lukasbreuer.commandra;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Command {
  @Getter
  private final String name;
  @Getter
  private final String[] aliases;
  @Getter
  private final String[] arguments;

  /**
   * Is called when a command is executed
   * @param arguments The entered arguments
   * @return Success
   * @throws Exception
   */
  public abstract boolean execute(String[] arguments) throws Exception;
}
