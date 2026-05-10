package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CandyCane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.7f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -3.5f, -2f)
                lineToRelative(8.6f, -14f)
                arcToRelative(6f, 6f, 0f, false, true, 10.4f, 6f)
                arcToRelative(2f, 2f, 0f, true, true, -3.464f, -2f)
                arcToRelative(2f, 2f, 0f, true, false, -3.464f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.75f, 7f)
                lineTo(15f, 2.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.9f, 4.8f)
                lineTo(13f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.9f, 9.7f)
                lineToRelative(2f, 4.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.9f, 14.7f)
                lineTo(7f, 18.9f)
            }
}

public val LucideIcons.All.CandyCaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CandyCane: ImageVector
    @Composable get() = CandyCaneDefinition.asImageVector()
