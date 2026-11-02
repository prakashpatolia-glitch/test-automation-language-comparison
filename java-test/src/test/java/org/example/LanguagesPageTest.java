package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

class LanguagesPageTest {

  @Test
  void showsPageHeading() {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch();
      Page page = browser.newPage();
      page.navigate("https://playwright.dev/docs/languages");
      assertThat(
        page.getByRole(AriaRole.HEADING,
          new Page.GetByRoleOptions().setName("Supported languages").setLevel(1))
      ).isVisible();
    }
  }
}