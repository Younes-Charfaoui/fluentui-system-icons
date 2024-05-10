package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderMail20: ImageVector
  get() {
    if (_folderMail20 != null) {
      return _folderMail20!!
    }
    _folderMail20 = fluentIcon(name = "Filled.FolderMail20", 20f) {
      materialPath {
          moveTo(2.0F, 5.5F)
          curveTo(2.0F, 4.12F, 3.12F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(2.482F)
          curveToRelative(0.464F, 0.0F, 0.91F, 0.184F, 1.238F, 0.513F)
          lineToRelative(1.28F, 1.28F)
          lineToRelative(-2.06F, 2.06F)
          curveTo(7.345F, 6.948F, 7.217F, 7.0F, 7.085F, 7.0F)
          horizontalLineTo(2.0F)
          verticalLineTo(5.5F)
          close()
          moveTo(2.0F, 8.0F)
          verticalLineToRelative(6.5F)
          curveTo(2.0F, 15.88F, 3.12F, 17.0F, 4.5F, 17.0F)
          horizontalLineToRelative(4.55F)
          curveTo(9.017F, 16.838F, 9.0F, 16.671F, 9.0F, 16.5F)
          verticalLineToRelative(-4.0F)
          curveToRelative(0.0F, -1.38F, 1.12F, -2.5F, 2.5F, -2.5F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.171F, 0.0F, 0.338F, 0.017F, 0.5F, 0.05F)
          verticalLineTo(7.5F)
          curveTo(18.0F, 6.12F, 16.88F, 5.0F, 15.5F, 5.0F)
          horizontalLineToRelative(-4.793F)
          lineToRelative(-2.56F, 2.56F)
          curveTo(7.864F, 7.843F, 7.483F, 8.0F, 7.085F, 8.0F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(8.013F, 4.304F)
          lineToRelative(4.497F, 2.623F)
          lineTo(19.0F, 12.509F)
          verticalLineTo(12.5F)
          curveToRelative(0.0F, -0.828F, -0.672F, -1.5F, -1.5F, -1.5F)
          horizontalLineToRelative(-6.0F)
          curveToRelative(-0.762F, 0.0F, -1.391F, 0.568F, -1.487F, 1.304F)
          close()
          moveTo(19.0F, 13.644F)
          lineToRelative(-4.263F, 2.296F)
          curveToRelative(-0.153F, 0.083F, -0.338F, 0.08F, -0.489F, -0.008F)
          lineTo(10.0F, 13.454F)
          verticalLineTo(16.5F)
          curveToRelative(0.0F, 0.828F, 0.672F, 1.5F, 1.5F, 1.5F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-2.855F)
          close()        
      }
    }
    return _folderMail20!!
  }

private var _folderMail20: ImageVector? = null
