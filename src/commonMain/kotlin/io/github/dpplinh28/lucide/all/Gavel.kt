package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gavel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 13f)
                lineToRelative(-8.381f, 8.38f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineToRelative(8.384f, -8.381f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 16f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.5f, 10.5f)
                lineToRelative(-8f, -8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 8f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 7.5f)
                lineToRelative(8f, 8f)
            }
}

public val LucideIcons.All.GavelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gavel: ImageVector
    @Composable get() = GavelDefinition.asImageVector()
