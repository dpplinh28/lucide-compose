package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Feather") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.67f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 1.416f, -.588f)
                lineToRelative(6.154f, -6.172f)
                arcToRelative(6f, 6f, 0f, false, false, -8.49f, -8.49f)
                lineTo(5.586f, 9.914f)
                arcTo(2f, 2f, 0f, false, false, 5f, 11.328f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                lineTo(2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 15f)
                horizontalLineTo(9f)
            }
}

public val LucideIcons.All.FeatherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Feather: ImageVector
    @Composable get() = FeatherDefinition.asImageVector()
