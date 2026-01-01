package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement dashboardHeader;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLink;

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;

	// Submenu items
	// 1.Catalog

	@FindBy(xpath = "//p[contains(text(),'Catalog')]")
	WebElement catalogMenu;

	// sub menus under catalog
	@FindBy(xpath = "//p[contains(text(),'Products')]")
	WebElement productsMenu;

	@FindBy(xpath = "//p[contains(text(),'Categories')]")
	WebElement categoriesMenu;

	@FindBy(xpath = "//p[contains(text(),'Manufacturers')]")
	WebElement manufacturersMenu;

	@FindBy(xpath = "//p[contains(text(),'Product reviews')]")
	WebElement productReviewsMenu;

	@FindBy(xpath = "//p[contains(text(),'Product tags')]")
	WebElement productTagsMenu;

	@FindBy(xpath = "//p[contains(text(),'Attributes')]")
	WebElement attributesMenu;
	// end of sub menus under catalog

	// 2.Sales

	@FindBy(xpath = "//p[contains(text(),'Sales')]")
	WebElement salesMenu;

	// sub menus under sales

	@FindBy(xpath = "//p[contains(text(),'Orders')]")
	WebElement ordersMenu;

	@FindBy(xpath = "//p[contains(text(),'Shipments')]")
	WebElement shipmentsMenu;

	@FindBy(xpath = "//p[contains(text(),'Return requests')]")
	WebElement returnRequestsMenu;

	@FindBy(xpath = "//p[contains(text(),'Recurring payments')]")
	WebElement recurringPaymentsMenu;

	@FindBy(xpath = "//p[contains(text(),'Gift cards')]")
	WebElement giftCardsMenu;

	@FindBy(xpath = "//p[contains(text(),'Shopping carts and wishlists')]")
	WebElement shoppingCartsAndWishlistsMenu;

	@FindBy(xpath = "//p[contains(text(),'Requests for quote')]")
	WebElement requestsForQuoteMenu;

	@FindBy(xpath = "//p[contains(text(),'Quotes')]")
	WebElement quotesMenu;

	// 3.Customers

	@FindBy(xpath = "//p[contains(text(),'Customers')]")
	WebElement customersMenu;

	// Sub menus under customers

	@FindBy(xpath = "//ul[contains(@class,'nav-treeview')]//p[contains(normalize-space(),'Customers')]")
	WebElement customersSubMenu;

	@FindBy(xpath = "//p[contains(text(),'Customer roles')]")
	WebElement customerRolesMenu;

	@FindBy(xpath = "//p[contains(text(),'Online customers')]")
	WebElement onlineCustomersMenu;

	@FindBy(xpath = "//p[contains(text(),'Vendors')]")
	WebElement vendorsMenu;

	@FindBy(xpath = "//p[contains(text(),'Activity log')]")
	WebElement activityLogMenu;

	@FindBy(xpath = "//p[contains(text(),'Activity Types')]")
	WebElement activityTypesMenu;

	@FindBy(xpath = "//p[contains(text(),'GDPR requests (log)')]")
	WebElement gdprRequestsLogMenu;

	// end of sub menus under customers

	// 4. Promotions

	@FindBy(xpath = "//p[contains(text(),'Promotions')]")
	WebElement promotionsMenu;

	// sub menus under promotions

	@FindBy(xpath = "//p[contains(text(),'Discounts')]")
	WebElement discountsMenu;

	@FindBy(xpath = "//p[contains(text(),'Affiliates')]")
	WebElement affiliatesMenu;

	@FindBy(xpath = "//p[contains(text(),'Newsletter subscribers')]")
	WebElement newsletterSubscribersMenu;

	@FindBy(xpath = "//p[contains(text(),'Subscription types')]")
	WebElement subscriptionTypesMenu;

	@FindBy(xpath = "//p[contains(text(),'Campaigns')]")
	WebElement campaignsMenu;

	// end of sub menus under promotions

	// 5. Content Management

	@FindBy(xpath = "//p[contains(text(),'Content management')]")
	WebElement contentManagementMenu;

	// Sub menus under Content Management

	@FindBy(xpath = "//p[contains(text(),'Topics (pages)')]")
	WebElement topicsPagesMenu;

	@FindBy(xpath = "//p[contains(text(),'Menus')]")
	WebElement menusMenu;

	@FindBy(xpath = "//p[contains(text(),'Message templates')]")
	WebElement messageTemplatesMenu;

	@FindBy(xpath = "//p[contains(text(),'News items')]")
	WebElement newsItemsMenu;

	@FindBy(xpath = "//p[contains(text(),'News comments')]")
	WebElement newsCommentsMenu;

	@FindBy(xpath = "//p[contains(text(),'Blog posts')]")
	WebElement blogPostsMenu;

	@FindBy(xpath = "//p[contains(text(),'Blog comments')]")
	WebElement blogCommentsMenu;

	@FindBy(xpath = "//p[contains(text(),'Polls')]")
	WebElement pollsMenu;

	@FindBy(xpath = "//p[contains(text(),'Forums')]")
	WebElement forumsMenu;

	// end of sub menus under Content Management

	// 6. Configuration

	@FindBy(xpath = "//nav//p[normalize-space()='Configuration'][1]")
	WebElement configurationMenu;

	// sub menus under Configuration

	@FindBy(xpath = "//p[contains(text(),'Settings')]")
	WebElement settingsMenu;

	// Sub menus under Settings
	@FindBy(xpath = "//p[contains(text(),'General settings')]")
	WebElement generalSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Customer settings')]")
	WebElement customerSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Order settings')]")
	WebElement orderSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Shipping settings')]")
	WebElement shippingSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Tax settings')]")
	WebElement taxSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Catalog settings')]")
	WebElement catalogSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Filter (YMM) settings')]")
	WebElement filterYMMSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Shopping cart settings')]")
	WebElement shoppingCartSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Reward points')]")
	WebElement rewardPointsMenu;

	@FindBy(xpath = "//p[contains(text(),'GDPR settings')]")
	WebElement gdprSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Vendor settings')]")
	WebElement vendorSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Blog settings')]")
	WebElement blogSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'News settings')]")
	WebElement newsSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Forum settings')]")
	WebElement forumSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'Media settings')]")
	WebElement mediaSettingsMenu;

	@FindBy(xpath = "//p[contains(text(),'All settings (advanced)')]")
	WebElement allSettingsAdvancedMenu;

	// end of Sub menus under Settings

	@FindBy(xpath = "//p[contains(text(),'Email accounts')]")
	WebElement emailAccountsMenu;

	@FindBy(xpath = "//p[contains(text(),'Stores')]")
	WebElement storesMenu;

	@FindBy(xpath = "//p[contains(text(),'Countries')]")
	WebElement countriesMenu;

	@FindBy(xpath = "//p[contains(text(),'Languages')]")
	WebElement languagesMenu;

	@FindBy(xpath = "//p[contains(text(),'Currencies')]")
	WebElement currenciesMenu;

	@FindBy(xpath = "//p[contains(text(),'Payment methods')]")
	WebElement paymentMethodsMenu;

	@FindBy(xpath = "//p[contains(text(),'Payment restrictions')]")
	WebElement paymentRestrictionsMenu;

	@FindBy(xpath = "//p[contains(text(),'Tax providers')]")
	WebElement taxProvidersMenu;

	@FindBy(xpath = "//p[contains(text(),'Tax categories')]")
	WebElement taxCategoriesMenu;

	@FindBy(xpath = "//p[contains(text(),'Shipping')]")
	WebElement shippingMenu;

//sub menus under Shipping menu

	@FindBy(xpath = "//p[contains(text(),'Shipping providers')]")
	WebElement shippingProvidersMenu;

	@FindBy(xpath = "//p[contains(text(),'Warehouses')]")
	WebElement warehousesMenu;

	@FindBy(xpath = "//p[contains(text(),'Pickup points')]")
	WebElement pickupPointsMenu;

	@FindBy(xpath = "//p[contains(text(),'Dates and ranges')]")
	WebElement datesAndRangesMenu;

	@FindBy(xpath = "//p[contains(text(),'Measures')]")
	WebElement measuresMenu;
	// end of sub menus under Shipping menu

	@FindBy(xpath = "//p[contains(text(),'PayPal Zettle (POS)')]")
	WebElement payPalZettleMenu;

	@FindBy(xpath = "//p[contains(text(),'Access control list')]")
	WebElement accessControlListMenu;

	@FindBy(xpath = "//p[contains(text(),'Widgets')]")
	WebElement widgetsMenu;

	@FindBy(xpath = "//p[contains(text(),'Authentication')]")
	WebElement authenticationMenu;

	// sub menus under Authentication menu

	@FindBy(xpath = "//p[contains(text(),'External authentication')]")
	WebElement externalAuthenticationMenu;

	@FindBy(xpath = "//p[contains(text(),'Multi-factor authentication')]")
	WebElement multiFactorAuthenticationMenu;

	// end of sub menus under Authentication menu

	@FindBy(xpath = "//p[contains(text(),'PayPal Commerce')]")
	WebElement payPalCommerceMenu;

	// sub menus under PayPal Commerce menu

	@FindBy(xpath = "//p[contains(text(),'Configuration')]")
	WebElement payPalCommerceConfigurationMenu;

	// end of sub menus under PayPal Commerce menu

	@FindBy(xpath = "//p[contains(text(),'Dynamics 365')]")
	WebElement dynamics365Menu;

	@FindBy(xpath = "//p[contains(text(),'Mobile App')]")
	WebElement mobileAppMenu;

	@FindBy(xpath = "//p[contains(text(),'EU Omnibus Directive')]")
	WebElement euOmnibusDirectiveMenu;

	@FindBy(xpath = "//p[contains(text(),'Web API Frontend')]")
	WebElement webAPIFrontendMenu;

	@FindBy(xpath = "//p[contains(text(),'Lucene search provider')]")
	WebElement luceneSearchProviderMenu;

	@FindBy(xpath = "//p[contains(text(),'Local plugins')]")
	WebElement localPluginsMenu;

	@FindBy(xpath = "//p[contains(text(),'All plugins and themes')]")
	WebElement allPluginsAndThemesMenu;

	// end of sub menus under Configuration

	// 7. System

	@FindBy(xpath = "//p[contains(text(),'System')]")
	WebElement systemMenu;

	// sub menus under System

	@FindBy(xpath = "//p[contains(text(),'System information')]")
	WebElement systemInformationMenu;

	@FindBy(xpath = "//p[contains(text(),'Log')]")
	WebElement logMenu;

	@FindBy(xpath = "//p[contains(text(),'Warnings')]")
	WebElement warningsMenu;

	@FindBy(xpath = "//p[contains(text(),'Maintenance')]")
	WebElement maintenanceMenu;

	@FindBy(xpath = "//p[contains(text(),'Message queue')]")
	WebElement messageQueueMenu;

	@FindBy(xpath = "//p[contains(text(),'Schedule task')]")
	WebElement scheduleTaskMenu;

	@FindBy(xpath = "//p[contains(text(),'Search engine friendly page names')]")
	WebElement searchEngineFriendlyPageNamesMenu;

	@FindBy(xpath = "//p[contains(text(),'Templates')]")
	WebElement templatesMenu;

	// end of sub menus under System

	// 8. Reports

	@FindBy(xpath = "//p[contains(text(),'Reports')]")
	WebElement reportsMenu;

	// sub menus under Reports

	@FindBy(xpath = "//p[contains(text(),'PowerBI')]")
	WebElement powerBIMenu;

	@FindBy(xpath = "//p[contains(text(),'Sales summary')]")
	WebElement salesSummaryMenu;

	@FindBy(xpath = "//p[contains(text(),'Low stock')]")
	WebElement lowStockMenu;

	@FindBy(xpath = "//p[contains(text(),'Bestsellers')]")
	WebElement bestsellersMenu;

	@FindBy(xpath = "//p[contains(text(),'Products never purchased')]")
	WebElement productsNeverPurchasedMenu;

	@FindBy(xpath = "//p[contains(text(),'Country sales')]")
	WebElement countrySalesMenu;

	@FindBy(xpath = "//p[contains(text(),'Customer reports')]")
	WebElement customerReportsMenu;

	// Sub menus under Customer reports

	@FindBy(xpath = "//p[contains(text(),'Registered customers')]")
	WebElement registeredCustomersMenu;

	@FindBy(xpath = "//p[contains(text(),'Customers by order total')]")
	WebElement customersByOrderTotalMenu;

	@FindBy(xpath = "//p[contains(text(),'Customers by number of orders')]")
	WebElement customersByNumberOfOrdersMenu;

	// end of Sub menus under Customer reports

	// end of sub menus under Reports

	// 9. Help

	@FindBy(xpath = "//p[contains(text(),'Help')]")
	WebElement helpMenu;

	// Sub menus under Help

	@FindBy(xpath = "//p[contains(text(),'Training')]")
	WebElement trainingMenu;

	@FindBy(xpath = "//p[contains(text(),'Documentation')]")
	WebElement documentationMenu;

	@FindBy(xpath = "//p[contains(text(),'Community forums')]")
	WebElement communityForumsMenu;

	@FindBy(xpath = "//p[contains(text(),'Premium support services')]")
	WebElement premiumSupportServicesMenu;

	@FindBy(xpath = "//p[contains(text(),'Solution partners')]")
	WebElement solutionPartnersMenu;

//Methods to interact with the page

	// 1. Verify Dashboard is displayed
	public boolean isDashboardDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(dashboardHeader)).isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

	// 2.Verify logout button and click
	public void clickLogout() {

		wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
	}
	
	//Logout button visible
	public boolean isLogoutVisible() {
	    try {
	        return wait.until(
	            ExpectedConditions.visibilityOf(logoutLink)
	        ).isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}

	// 3. Search box interaction

	public void enterSearchText(String searchText) {
		if (searchText == null)

			return;

		WebElement searchBox = wait.until(ExpectedConditions.visibilityOf(this.searchBox));
		searchBox.clear();
		searchBox.sendKeys(searchText);
	}
	
	public boolean isMenuVisible(WebElement Menu) {
		
		try {
			return wait.until(ExpectedConditions.visibilityOf(Menu)).isDisplayed();
		}
		catch (Exception e) {
			
			return false;
		}
	}

	// Generic click method for any menu
	public void clickMenu(WebElement menuElement) {
		wait.until(ExpectedConditions.elementToBeClickable(menuElement)).click();
	}

	// 1.Catalog
	// Specific methods for Catalog menu and its submenus

	public void openCatalogMenu() {
		clickMenu(catalogMenu);

	}

	public void clickProductsMenu() {
		openCatalogMenu();
		clickMenu(productsMenu);
	}

	public void clickCategoriesMenu() {
		openCatalogMenu();
		clickMenu(categoriesMenu);
	}

	public void clickManufacturersMenu() {
		openCatalogMenu();
		clickMenu(manufacturersMenu);
	}

	public void clickProductReviewsMenu() {
		openCatalogMenu();
		clickMenu(productReviewsMenu);

	}

	public void clickProductTagsMenu() {
		openCatalogMenu();
		clickMenu(productTagsMenu);
	}

	public void clickAttributesMenu() {
		openCatalogMenu();
		clickMenu(attributesMenu);
	}

	// 2.Sales
	// Similarly, methods for sales menu and its submenu

	public void openSalesMenu() {
		clickMenu(salesMenu);
	}

	public void clickOrdersMenu() {
		openSalesMenu();
		clickMenu(ordersMenu);
	}

	public void clickShipmentsMenu() {
		openSalesMenu();
		clickMenu(shipmentsMenu);
	}

	public void clickReturnRequestsMenu() {
		openSalesMenu();
		clickMenu(returnRequestsMenu);
	}

	public void clickRecurringPaymentsMenu() {
		openSalesMenu();
		clickMenu(recurringPaymentsMenu);
	}

	public void clickGiftCardsMenu() {
		openSalesMenu();
		clickMenu(giftCardsMenu);
	}

	public void clickShoppingCartsAndWishlistsMenu() {
		openSalesMenu();
		clickMenu(shoppingCartsAndWishlistsMenu);
	}

	public void clickRequestsForQuoteMenu() {
		openSalesMenu();
		clickMenu(requestsForQuoteMenu);
	}

	public void clickQuotesMenu() {
		openSalesMenu();
		clickMenu(quotesMenu);
	}

	// 3.Customers
	// Similarly, methods for Customers menu and its submenu

	public void openCustomersMenu() {
		clickMenu(customersMenu);
	}

	public void clickCustomersSubMenu() {
		openCustomersMenu();
		clickMenu(customersSubMenu);
	}

	public void clickCustomerRolesMenu() {
		openCustomersMenu();
		clickMenu(customerRolesMenu);
	}

	public void clickOnlineCustomersMenu() {
		openCustomersMenu();
		clickMenu(onlineCustomersMenu);
	}

	public void clickVendorsMenu() {
		openCustomersMenu();
		clickMenu(vendorsMenu);

	}

	public void clickActivityLogMenu() {
		openCustomersMenu();
		clickMenu(activityLogMenu);
	}

	public void clickActivityTypesMenu() {
		openCustomersMenu();
		clickMenu(activityTypesMenu);
	}

	public void clickGdprRequestsLogMenu() {
		openCustomersMenu();
		clickMenu(gdprRequestsLogMenu);
	}

	// 4.Promotions
	// Similarly, methods for Promotions menu and its submenu

	public void openPromotionsMenu() {
		clickMenu(promotionsMenu);
	}

	public void clickDiscountsMenu() {
		openPromotionsMenu();
		clickMenu(discountsMenu);
	}

	public void clickAffiliatesMenu() {
		openPromotionsMenu();
		clickMenu(affiliatesMenu);
	}

	public void clickNewsletterSubscribersMenu() {
		openPromotionsMenu();
		clickMenu(newsletterSubscribersMenu);
	}

	public void clickSubscriptionTypesMenu() {
		openPromotionsMenu();
		clickMenu(subscriptionTypesMenu);
	}

	public void clickCampaignsMenu() {
		openPromotionsMenu();
		clickMenu(campaignsMenu);
	}

	// 5.Content Management
	// Similarly, methods for Content Management menu and its submenu

	public void openContentManagementMenu() {
		clickMenu(contentManagementMenu);
	}

	public void clickTopicsPagesMenu() {
		openContentManagementMenu();
		clickMenu(topicsPagesMenu);
	}

	public void clickMenusMenu() {
		openContentManagementMenu();
		clickMenu(menusMenu);
	}

	public void clickMessageTemplatesMenu() {
		openContentManagementMenu();
		clickMenu(messageTemplatesMenu);
	}

	public void clickNewsItemsMenu() {
		openContentManagementMenu();
		clickMenu(newsItemsMenu);
	}

	public void clickNewsCommentsMenu() {
		openContentManagementMenu();
		clickMenu(newsCommentsMenu);
	}

	public void clickBlogPostsMenu() {
		openContentManagementMenu();
		clickMenu(blogPostsMenu);
	}

	public void clickBlogCommentsMenu() {
		openContentManagementMenu();
		clickMenu(blogCommentsMenu);
	}

	public void clickPollsMenu() {
		openContentManagementMenu();
		clickMenu(pollsMenu);
	}

	public void clickForumsMenu() {
		openContentManagementMenu();
		clickMenu(forumsMenu);

	}

	// 6.Configuration
	// Similarly, methods for Configuration menu and its submenu

	public void openConfigurationMenu() {
		clickMenu(configurationMenu);
	}

	public void clickSettingsMenu() {
		openConfigurationMenu();
		clickMenu(settingsMenu);
	}
	// methods of sub menus under Settings.

	public void clickGeneralSettingsMenu() {
		openConfigurationMenu();
		clickMenu(generalSettingsMenu);
	}

	public void clickCustomerSettingsMenu() {
		openConfigurationMenu();
		clickMenu(customerSettingsMenu);
	}

	public void clickOrderSettingsMenu() {
		openConfigurationMenu();
		clickMenu(orderSettingsMenu);
	}

	public void clickShippingSettingsMenu() {
		openConfigurationMenu();
		clickMenu(shippingSettingsMenu);

	}

	public void clickTaxSettingsMenu() {
		openConfigurationMenu();
		clickMenu(taxSettingsMenu);
	}

	public void clickCatalogSettingsMenu() {
		openConfigurationMenu();
		clickMenu(catalogSettingsMenu);
	}

	public void clickFilterYMMSettingsMenu() {
		openConfigurationMenu();
		clickMenu(filterYMMSettingsMenu);
	}

	public void clickShoppingCartSettingsMenu() {
		openConfigurationMenu();
		clickMenu(shoppingCartSettingsMenu);
	}

	public void clickRewardPointsMenu() {
		openConfigurationMenu();
		clickMenu(rewardPointsMenu);
	}

	public void clickGdprSettingsMenu() {
		openConfigurationMenu();
		clickMenu(gdprSettingsMenu);
	}

	public void clickVendorSettingsMenu() {
		openConfigurationMenu();
		clickMenu(vendorSettingsMenu);
	}

	public void clickBlogSettingsMenu() {
		openConfigurationMenu();
		clickMenu(blogSettingsMenu);
	}

	public void clickNewsSettingsMenu() {
		openConfigurationMenu();
		clickMenu(newsSettingsMenu);
	}

	public void clickForumSettingsMenu() {
		openConfigurationMenu();
		clickMenu(forumSettingsMenu);
	}

	public void clickMediaSettingsMenu() {
		openConfigurationMenu();
		clickMenu(mediaSettingsMenu);
	}

	public void clickAllSettingsAdvancedMenu() {
		openConfigurationMenu();
		clickMenu(allSettingsAdvancedMenu);
	}

	public void clickEmailAccountsMenu() {
		openConfigurationMenu();
		clickMenu(emailAccountsMenu);
	}

	public void clickStoresMenu() {
		openConfigurationMenu();
		clickMenu(storesMenu);
	}

	public void clickCountriesMenu() {
		openConfigurationMenu();
		clickMenu(countriesMenu);
	}

	public void clickLanguagesMenu() {
		openConfigurationMenu();
		clickMenu(languagesMenu);
	}

	public void clickCurrenciesMenu() {
		openConfigurationMenu();
		clickMenu(currenciesMenu);
	}

	public void clickPaymentMethodsMenu() {
		openConfigurationMenu();
		clickMenu(paymentMethodsMenu);
	}

	public void clickPaymentRestrictionsMenu() {
		openConfigurationMenu();
		clickMenu(paymentRestrictionsMenu);
	}

	public void clickTaxProvidersMenu() {
		openConfigurationMenu();
		clickMenu(taxProvidersMenu);
	}

	public void clickTaxCategoriesMenu() {
		openConfigurationMenu();
		clickMenu(taxCategoriesMenu);
	}

	public void clickShippingMenu() {
		openConfigurationMenu();
		clickMenu(shippingMenu);
	}
	// sub menus under Shipping menu

	public void clickShippingProvidersMenu() {
		openConfigurationMenu();
		clickMenu(shippingProvidersMenu);

	}

	public void clickWarehousesMenu() {
		openConfigurationMenu();
		clickMenu(warehousesMenu);
	}

	public void clickPickupPointsMenu() {
		openConfigurationMenu();
		clickMenu(pickupPointsMenu);
	}

	public void clickDatesAndRangesMenu() {
		openConfigurationMenu();
		clickMenu(datesAndRangesMenu);
	}

	public void clickMeasuresMenu() {
		openConfigurationMenu();
		clickMenu(measuresMenu);
	}

	public void clickPayPalZettleMenu() {
		openConfigurationMenu();
		clickMenu(payPalZettleMenu);
	}

	public void clickAccessControlListMenu() {
		openConfigurationMenu();
		clickMenu(accessControlListMenu);
	}

	public void clickWidgetsMenu() {
		openConfigurationMenu();
		clickMenu(widgetsMenu);
	}

	public void clickAuthenticationMenu() {
		openConfigurationMenu();
		clickMenu(authenticationMenu);
	}

	// methods for sub menus under Authentication menu

	public void clickExternalAuthenticationMenu() {
		openConfigurationMenu();
		clickMenu(externalAuthenticationMenu);
	}

	public void clickMultiFactorAuthenticationMenu() {
		openConfigurationMenu();
		clickMenu(multiFactorAuthenticationMenu);

	}

	public void clickPayPalCommerceMenu() {
		openConfigurationMenu();
		clickMenu(payPalCommerceMenu);
	}

	// sub menus under PayPal Commerce menu

	public void clickPayPalCommerceConfigurationMenu() {
		openConfigurationMenu();
		clickMenu(payPalCommerceConfigurationMenu);
	}

	public void clickDynamics365Menu() {
		openConfigurationMenu();
		clickMenu(dynamics365Menu);
	}

	public void clickMobileAppMenu() {
		openConfigurationMenu();
		clickMenu(mobileAppMenu);
	}

	public void clickEuOmnibusDirectiveMenu() {
		openConfigurationMenu();
		clickMenu(euOmnibusDirectiveMenu);
	}

	public void clickWebAPIFrontendMenu() {
		openConfigurationMenu();
		clickMenu(webAPIFrontendMenu);
	}

	public void clickLuceneSearchProviderMenu() {
		openConfigurationMenu();
		clickMenu(luceneSearchProviderMenu);
	}

	public void clickLocalPluginsMenu() {
		openConfigurationMenu();
		clickMenu(localPluginsMenu);
	}

	public void clickAllPluginsAndThemesMenu() {
		openConfigurationMenu();
		clickMenu(allPluginsAndThemesMenu);
	}

	// 7.System
	// Similarly, methods for System menu and its submenu

	public void openSystemMenu() {
		clickMenu(systemMenu);
	}

	public void clickSystemInformationMenu() {
		openSystemMenu();
		clickMenu(systemInformationMenu);
	}

	public void clickLogMenu() {
		openSystemMenu();
		clickMenu(logMenu);
	}

	public void clickWarningsMenu() {
		openSystemMenu();
		clickMenu(warningsMenu);
	}

	public void clickMaintenanceMenu() {
		openSystemMenu();
		clickMenu(maintenanceMenu);
	}

	public void clickMessageQueueMenu() {
		openSystemMenu();
		clickMenu(messageQueueMenu);
	}

	public void clickScheduleTaskMenu() {
		openSystemMenu();
		clickMenu(scheduleTaskMenu);
	}

	public void clickSearchEngineFriendlyPageNamesMenu() {
		openSystemMenu();
		clickMenu(searchEngineFriendlyPageNamesMenu);
	}

	public void clickTemplatesMenu() {
		openSystemMenu();
		clickMenu(templatesMenu);
	}

	// 8.Reports
	// Similarly, methods for Reports menu and its submenu

	public void openReportsMenu() {

		clickMenu(reportsMenu);
	}

	public void clickPowerBIMenu() {
		openReportsMenu();
		clickMenu(powerBIMenu);

	}

	public void clickSalesSummaryMenu() {
		openReportsMenu();
		clickMenu(salesSummaryMenu);

	}

	public void clickLowStockMenu() {
		openReportsMenu();
		clickMenu(lowStockMenu);
	}

	public void clickBestsellersMenu() {
		openReportsMenu();
		clickMenu(bestsellersMenu);

	}

	public void clickProductsNeverPurchasedMenu() {

		openReportsMenu();
		clickMenu(productsNeverPurchasedMenu);
	}

	public void clickCountrySalesMenu() {
		openReportsMenu();
		clickMenu(countrySalesMenu);
	}

	public void clickCustomerReportsMenu() {
		openReportsMenu();
		clickMenu(customerReportsMenu);
	}

	// methods for Sub menus under Customer reports

	public void clickRegisteredCustomersMenu() {
		openReportsMenu();
		clickMenu(registeredCustomersMenu);
	}

	public void clickCustomersByOrderTotalMenu() {
		openReportsMenu();
		clickMenu(customersByOrderTotalMenu);
	}

	public void clickCustomersByNumberOfOrdersMenu() {
		openReportsMenu();
		clickMenu(customersByNumberOfOrdersMenu);
	}

	// 9.Help
	// Similarly, methods for Help menu and its submenu

	public void openHelpMenu() {

		clickMenu(helpMenu);
	}

	public void clickTrainingMenu() {
		openHelpMenu();
		clickMenu(trainingMenu);

	}

	public void clickDocumentationMenu() {
		openHelpMenu();
		clickMenu(documentationMenu);

	}

	public void clickCommunityForumsMenu() {
		openHelpMenu();
		clickMenu(communityForumsMenu);
	}

	public void clickPremiumSupportServicesMenu() {

		openHelpMenu();
		clickMenu(premiumSupportServicesMenu);
	}
	
	public void clickSolutionPartners() {
		
		openHelpMenu();
		clickMenu(solutionPartnersMenu);
	}

}