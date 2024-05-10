package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.MailRead24: ImageVector
  get() {
    if (_mailRead24 != null) {
      return _mailRead24!!
    }
    _mailRead24 = fluentIcon(name = "Regular.MailRead24", 24f) {
      materialPath {
          moveTo(13.19F, 2.34F)
          curveToRelative(-0.728F, -0.455F, -1.652F, -0.455F, -2.38F, 0.0F)
          lineTo(3.06F, 7.172F)
          curveTo(2.4F, 7.584F, 2.0F, 8.306F, 2.0F, 9.083F)
          verticalLineToRelative(7.667F)
          curveTo(2.0F, 18.545F, 3.455F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(9.082F)
          curveToRelative(0.0F, -0.776F, -0.4F, -1.498F, -1.06F, -1.909F)
          lineTo(13.19F, 2.34F)
          close()
          moveToRelative(-1.587F, 1.272F)
          curveToRelative(0.243F, -0.151F, 0.551F, -0.151F, 0.794F, 0.0F)
          lineToRelative(7.242F, 4.517F)
          lineTo(12.0F, 12.15F)
          lineTo(4.361F, 8.13F)
          lineToRelative(7.242F, -4.517F)
          close()
          moveTo(3.5F, 9.371F)
          lineToRelative(8.15F, 4.29F)
          curveToRelative(0.22F, 0.115F, 0.48F, 0.115F, 0.7F, 0.0F)
          lineToRelative(8.15F, -4.29F)
          verticalLineToRelative(7.379F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(5.25F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineTo(9.37F)
          close()        
      }
    }
    return _mailRead24!!
  }

private var _mailRead24: ImageVector? = null
