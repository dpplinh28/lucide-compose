package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 2f)
                lineToRelative(-8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 13.4f)
                verticalLineToRelative(7.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 13.4f)
                verticalLineToRelative(7.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 9f)
                verticalLineToRelative(8f)
                arcToRelative(10f, 5f, 0f, false, false, 20f, 0f)
                verticalLineTo(9f)
            }
}

public val LucideIcons.All.DrumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drum: ImageVector
    @Composable get() = DrumDefinition.asImageVector()
