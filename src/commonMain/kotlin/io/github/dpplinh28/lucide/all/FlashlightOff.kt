package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlashlightOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.652f, 6f)
                horizontalLineTo(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, false, false, -.8f, -2.4f)
                lineToRelative(-.6f, -.8f)
                arcTo(3f, 3f, 0f, false, true, 6f, 7f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.649f, 2f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, true, -.6f, 1.8f)
                lineToRelative(-.6f, .8f)
                arcToRelative(4f, 4f, 0f, false, false, -.55f, 1.007f)
            }
}

public val LucideIcons.All.FlashlightOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlashlightOff: ImageVector
    @Composable get() = FlashlightOffDefinition.asImageVector()
