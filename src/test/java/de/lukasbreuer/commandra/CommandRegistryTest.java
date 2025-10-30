package de.lukasbreuer.commandra;

import com.google.inject.Guice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class CommandRegistryTest {
  private class ExampleCommand extends Command {
    protected ExampleCommand() {
      super("example", new String[] {"test"}, new String[0]);
    }

    @Override
    public boolean execute(String[] arguments) throws Exception {
      return false;
    }
  }

  @Test
  void testHookRegistry() {
    var injector = Guice.createInjector(CommandInjectionModule.create());
    var registry = injector.getInstance(CommandRegistry.class);
    var command = new ExampleCommand();
    registry.register(command);
    var exampleCommandSearch = registry.find("example");
    Assertions.assertTrue(exampleCommandSearch.isPresent());
    Assertions.assertEquals(exampleCommandSearch.get(), command);
    var testCommandSearch = registry.find("test");
    Assertions.assertTrue(testCommandSearch.isPresent());
    Assertions.assertEquals(testCommandSearch.get(), command);
    registry.unregister(command);
  }
}