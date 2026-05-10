package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gift") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 11f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                arcTo(4.8f, 8f, 0f, false, true, 12f, 7f)
                arcToRelative(4.8f, 8f, 0f, false, true, 4.5f, -5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.GiftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gift: ImageVector
    @Composable get() = GiftDefinition.asImageVector()
