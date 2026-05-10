package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.236f, 18f)
                arcToRelative(3f, 3f, 0f, false, false, -2.2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 9f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.82f, 3.94f)
                arcToRelative(3f, 3f, 0f, true, true, 3.237f, 4.868f)
                lineToRelative(1.815f, 2.587f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 2.1f)
                lineToRelative(-2.872f, -.453f)
                arcToRelative(3f, 3f, 0f, false, false, -3.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 4.988f)
                arcToRelative(3f, 3f, 0f, true, false, -5.2f, 2.052f)
                arcTo(7f, 7f, 0f, false, false, 4f, 14.015f)
                arcTo(4f, 4f, 0f, false, false, 8f, 18f)
            }
}

public val LucideIcons.All.RatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rat: ImageVector
    @Composable get() = RatDefinition.asImageVector()
