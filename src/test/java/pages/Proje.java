package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Proje {

    @FindBy(xpath = "(//*[@class='fa fa fa-eye'])[3]")
    public WebElement ActionView;

    @FindBy(xpath = "//*[@class='text-center font-weight-bold']")
    public WebElement ActionMiniQuiz1;






    @FindBy(xpath = "//*[@class='fa fa-check-square ftlayer']")
    public WebElement ApplyLeave;

    @FindBy(xpath = "(//*[@class='sorting'])[1]")
    public WebElement ApplyLeaveClass;

    @FindBy(xpath = "(//*[@class='sorting'])[2]")
    public WebElement ApplyLeaveSection;

    @FindBy(xpath = "(//*[@class='sorting'])[3]")
    public WebElement ApplyLeaveApplyDate;

    @FindBy(xpath = "(//*[@class='sorting'])[4]")
    public WebElement ApplyLeaveFromDate;

    @FindBy(xpath = "(//*[@class='sorting'])[5]")
    public WebElement ApplyLeaveToDate;

    @FindBy(xpath = "(//*[@class='sorting'])[6]")
    public WebElement ApplyLeaveReason;

    @FindBy(xpath = "(//*[@class='sorting'])[7]")
    public WebElement ApplyLeaveStatus;

    @FindBy(xpath = "//*[@class=\"pull-right noExport sorting\"]")
    public WebElement ApplyLeaveAction;













    @FindBy(xpath = "(//*[@class='fa fa fa-eye'])[1]")
    public WebElement OnlineExamActionView;

    @FindBy(xpath = "//*[@class='text-center font-weight-bold']")
    public WebElement OnlineExamActionViewDeneme;






    @FindBy(xpath = "//*[@class='fa fa-user-secret ftlayer']")
    public WebElement TeachersReviews;

    @FindBy(xpath = "//*[@class='box-title titlefix']")
    public WebElement TeachersReviewsText;

    @FindBy(xpath = "//*[@class='btn btn-default btn-xs'])[5]")
    public WebElement TeachersReviewsAdd;

    @FindBy(xpath = "(//*[@class='fa fa-star'])[5]\n")
    public WebElement TeachersReviewsOy5;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement TeachersReviewsYorum;

    @FindBy(xpath = "//*[@class='btn btn-info pull-right']")
    public WebElement TeachersReviewsSave;
























}

