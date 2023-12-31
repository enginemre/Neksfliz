package com.engin.neksfliz.common_ui.util

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "small font",
    group = "font scales",
    fontScale = 0.5f
)
@Preview(
    name = "normal font",
    group = "font scales",
)
@Preview(
    name = "large font",
    group = "font scales",
    fontScale = 1.5f
)


@Preview(name = "Pixel", group = "Devices", device = Devices.PIXEL, showSystemUi = true, backgroundColor = 0, showBackground = true)
@Preview(name = "Pixel XL", group = "Devices", device = Devices.PIXEL_XL, showSystemUi = true, backgroundColor = 0, showBackground = true)
@Preview(name = "Pixel 4 XL", group = "Devices", device = Devices.PIXEL_4_XL, showSystemUi = true, backgroundColor = 0, showBackground = true)
@Preview(name = "Pixel C", group = "Devices", device = Devices.PIXEL_C, showSystemUi = true, backgroundColor = 0, showBackground = true)
annotation class DevicePreviews
