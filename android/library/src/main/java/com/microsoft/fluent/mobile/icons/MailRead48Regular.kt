package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailRead48: ImageVector
  get() {
    if (_mailRead48 != null) {
      return _mailRead48!!
    }
    _mailRead48 = fluentIcon(name = "Regular.MailRead48", 48f) {
      materialPath {
          moveTo(22.29F, 6.915F)
          curveToRelative(1.074F, -0.55F, 2.346F, -0.55F, 3.42F, 0.0F)
          lineToRelative(13.75F, 7.042F)
          curveToRelative(0.65F, 0.334F, 1.176F, 0.842F, 1.53F, 1.451F)
          lineTo(24.003F, 24.35F)
          lineToRelative(-16.96F, -8.998F)
          curveToRelative(0.354F, -0.584F, 0.867F, -1.072F, 1.498F, -1.395F)
          lineToRelative(13.75F, -7.042F)
          close()
          moveTo(6.5F, 17.894F)
          lineToRelative(16.914F, 8.974F)
          curveToRelative(0.365F, 0.194F, 0.802F, 0.194F, 1.168F, 0.002F)
          lineTo(41.5F, 17.965F)
          verticalLineTo(33.75F)
          curveToRelative(0.0F, 2.071F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineToRelative(-27.5F)
          curveToRelative(-2.071F, 0.0F, -3.75F, -1.679F, -3.75F, -3.75F)
          verticalLineTo(17.894F)
          close()
          moveTo(26.849F, 4.69F)
          curveToRelative(-1.789F, -0.916F, -3.91F, -0.916F, -5.698F, 0.0F)
          lineToRelative(-13.75F, 7.042F)
          curveTo(5.313F, 12.802F, 4.0F, 14.95F, 4.0F, 17.295F)
          verticalLineTo(33.75F)
          curveTo(4.0F, 37.202F, 6.798F, 40.0F, 10.25F, 40.0F)
          horizontalLineToRelative(27.5F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineTo(17.295F)
          curveToRelative(0.0F, -2.345F, -1.313F, -4.494F, -3.401F, -5.563F)
          lineTo(26.849F, 4.69F)
          close()        
      }
    }
    return _mailRead48!!
  }

private var _mailRead48: ImageVector? = null
