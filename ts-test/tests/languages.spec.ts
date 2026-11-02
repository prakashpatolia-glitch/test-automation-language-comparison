import { test, expect } from '@playwright/test';

test('languages page shows its heading', async ({ page }) => {
  await page.goto('https://playwright.dev/docs/languages');
  await expect(
    page.getByRole('heading', { name: 'Supported languages', level: 1 })
  ).toBeVisible();
});
