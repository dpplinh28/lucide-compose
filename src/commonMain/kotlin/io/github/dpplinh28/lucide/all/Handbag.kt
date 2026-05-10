package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Handbag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.048f, 18.566f)
                arcTo(2f, 2f, 0f, false, false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 1.952f, -2.434f)
                lineToRelative(-2f, -9f)
                arcTo(2f, 2f, 0f, false, false, 18f, 8f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -1.952f, 1.566f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.HandbagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Handbag: ImageVector
    @Composable get() = HandbagDefinition.asImageVector()
