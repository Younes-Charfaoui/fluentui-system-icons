package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PhoneChat16: ImageVector
  get() {
    if (_phoneChat16 != null) {
      return _phoneChat16!!
    }
    _phoneChat16 = fluentIcon(name = "Filled.PhoneChat16", 16f) {
      materialPath {
          moveTo(4.0F, 2.75F)
          curveTo(4.0F, 1.784F, 4.784F, 1.0F, 5.75F, 1.0F)
          horizontalLineToRelative(4.5F)
          curveTo(11.216F, 1.0F, 12.0F, 1.784F, 12.0F, 2.75F)
          verticalLineToRelative(3.272F)
          curveTo(11.835F, 6.008F, 11.668F, 6.0F, 11.5F, 6.0F)
          curveTo(8.462F, 6.0F, 6.0F, 8.462F, 6.0F, 11.5F)
          curveToRelative(0.0F, 0.81F, 0.175F, 1.58F, 0.49F, 2.273F)
          lineTo(6.117F, 15.0F)
          horizontalLineTo(5.75F)
          curveTo(4.784F, 15.0F, 4.0F, 14.216F, 4.0F, 13.25F)
          verticalLineTo(2.75F)
          close()
          moveTo(11.5F, 16.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          reflectiveCurveTo(13.985F, 7.0F, 11.5F, 7.0F)
          reflectiveCurveTo(7.0F, 9.015F, 7.0F, 11.5F)
          curveToRelative(0.0F, 0.792F, 0.205F, 1.536F, 0.564F, 2.182F)
          lineToRelative(-0.545F, 1.789F)
          curveToRelative(-0.095F, 0.313F, 0.197F, 0.605F, 0.51F, 0.51F)
          lineToRelative(1.79F, -0.544F)
          curveTo(9.965F, 15.796F, 10.709F, 16.0F, 11.5F, 16.0F)
          close()
          moveTo(9.0F, 10.5F)
          curveTo(9.0F, 10.224F, 9.224F, 10.0F, 9.5F, 10.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(13.776F, 11.0F, 13.5F, 11.0F)
          horizontalLineToRelative(-4.0F)
          curveTo(9.224F, 11.0F, 9.0F, 10.776F, 9.0F, 10.5F)
          close()
          moveTo(9.5F, 13.0F)
          curveTo(9.224F, 13.0F, 9.0F, 12.776F, 9.0F, 12.5F)
          reflectiveCurveTo(9.224F, 12.0F, 9.5F, 12.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(11.776F, 13.0F, 11.5F, 13.0F)
          horizontalLineToRelative(-2.0F)
          close()        
      }
    }
    return _phoneChat16!!
  }

private var _phoneChat16: ImageVector? = null