package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderMail16: ImageVector
  get() {
    if (_folderMail16 != null) {
      return _folderMail16!!
    }
    _folderMail16 = fluentIcon(name = "Filled.FolderMail16", 16f) {
      materialPath {
          moveTo(1.0F, 4.5F)
          curveTo(1.0F, 3.12F, 2.12F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(2.086F)
          curveToRelative(0.398F, 0.0F, 0.78F, 0.158F, 1.06F, 0.44F)
          lineTo(8.0F, 3.792F)
          lineToRelative(-2.06F, 2.06F)
          curveTo(5.845F, 5.948F, 5.717F, 6.0F, 5.585F, 6.0F)
          horizontalLineTo(1.0F)
          verticalLineTo(4.5F)
          close()
          moveTo(1.0F, 7.0F)
          verticalLineToRelative(4.5F)
          curveTo(1.0F, 12.88F, 2.12F, 14.0F, 3.5F, 14.0F)
          horizontalLineToRelative(2.55F)
          curveTo(6.017F, 13.838F, 6.0F, 13.671F, 6.0F, 13.5F)
          verticalLineToRelative(-4.0F)
          curveTo(6.0F, 8.12F, 7.12F, 7.0F, 8.5F, 7.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.171F, 0.0F, 0.338F, 0.017F, 0.5F, 0.05F)
          verticalLineTo(6.5F)
          curveTo(15.0F, 5.12F, 13.88F, 4.0F, 12.5F, 4.0F)
          horizontalLineTo(9.207F)
          lineToRelative(-2.56F, 2.56F)
          curveTo(6.364F, 6.843F, 5.983F, 7.0F, 5.585F, 7.0F)
          horizontalLineTo(1.0F)
          close()
          moveToRelative(10.51F, 4.927F)
          lineTo(7.013F, 9.304F)
          curveTo(7.109F, 8.568F, 7.738F, 8.0F, 8.5F, 8.0F)
          horizontalLineToRelative(6.0F)
          curveTo(15.328F, 8.0F, 16.0F, 8.672F, 16.0F, 9.5F)
          verticalLineToRelative(0.01F)
          lineToRelative(-4.49F, 2.417F)
          close()
          moveToRelative(0.227F, 1.013F)
          lineTo(16.0F, 10.645F)
          verticalLineTo(13.5F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineToRelative(-6.0F)
          curveTo(7.672F, 15.0F, 7.0F, 14.328F, 7.0F, 13.5F)
          verticalLineToRelative(-3.046F)
          lineToRelative(4.248F, 2.478F)
          curveToRelative(0.15F, 0.088F, 0.336F, 0.09F, 0.49F, 0.008F)
          close()        
      }
    }
    return _folderMail16!!
  }

private var _folderMail16: ImageVector? = null
