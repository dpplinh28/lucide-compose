package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DraftingCompass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12.99f, 6.74f)
                lineToRelative(1.93f, 3.44f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.136f, 12f)
                arcToRelative(10f, 10f, 0f, false, true, -14.271f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-2.16f, -3.84f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 21f)
                lineToRelative(8.02f, -14.26f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.DraftingCompassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DraftingCompass: ImageVector
    @Composable get() = DraftingCompassDefinition.asImageVector()
