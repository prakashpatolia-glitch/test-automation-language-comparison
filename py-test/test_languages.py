from playwright.sync_api import Page, expect


def test_languages_page_heading(page: Page):
    page.goto("https://playwright.dev/docs/languages")
    expect(
        page.get_by_role("heading", name="Supported languages", level=1)
    ).to_be_visible()