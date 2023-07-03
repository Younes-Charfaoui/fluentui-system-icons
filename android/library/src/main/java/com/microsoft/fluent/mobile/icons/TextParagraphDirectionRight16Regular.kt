package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextParagraphDirectionRight16: ImageVector
  get() {
    if (_textParagraphDirectionRight16 != null) {
      return _textParagraphDirectionRight16!!
    }
    _textParagraphDirectionRight16 = fluentIcon(name = "Regular.TextParagraphDirectionRight16", 16f) {
      materialPath {
          moveTo(9.0F, 3.0F)
          curveTo(7.62F, 3.0F, 6.5F, 4.12F, 6.5F, 5.5F)
          reflectiveCurveTo(7.62F, 8.0F, 9.0F, 8.0F)
          horizontalLineToRelative(1.0F)
          verticalLineTo(3.0F)
          horizontalLineTo(9.0F)
          close()
          moveToRelative(2.0F, 0.0F)
          verticalLineToRelative(10.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(10.0F, 13.776F, 10.0F, 13.5F)
          verticalLineTo(9.0F)
          horizontalLineTo(9.0F)
          curveTo(7.067F, 9.0F, 5.5F, 7.433F, 5.5F, 5.5F)
          reflectiveCurveTo(7.067F, 2.0F, 9.0F, 2.0F)
          horizontalLineToRelative(4.5F)
          curveTo(13.776F, 2.0F, 14.0F, 2.224F, 14.0F, 2.5F)
          reflectiveCurveTo(13.776F, 3.0F, 13.5F, 3.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(10.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(12.0F, 13.776F, 12.0F, 13.5F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(-1.0F)
          close()
          moveTo(2.146F, 6.146F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(1.5F, 1.5F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(-1.5F, 1.5F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.707F)
          lineTo(3.293F, 8.0F)
          lineTo(2.146F, 6.854F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          close()        
      }
    }
    return _textParagraphDirectionRight16!!
  }

private var _textParagraphDirectionRight16: ImageVector? = null