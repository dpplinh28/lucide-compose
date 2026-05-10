package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DnaOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                curveToRelative(-1.35f, 1.5f, -2.092f, 3f, -2.5f, 4.5f)
                lineTo(14f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 6f)
                lineToRelative(-2.891f, -2.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 15f)
                curveToRelative(3.333f, -3f, 6.667f, -3f, 10f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 9f)
                lineToRelative(.891f, .891f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                curveToRelative(-1.5f, 1.35f, -3f, 2.092f, -4.5f, 2.5f)
                lineToRelative(-1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.109f, 14.109f)
                lineTo(4f, 15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.5f, 12.5f)
                lineToRelative(1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 18f)
                lineToRelative(2.891f, 2.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 22f)
                curveToRelative(1.35f, -1.5f, 2.092f, -3f, 2.5f, -4.5f)
                lineTo(10f, 16f)
            }
}

public val LucideIcons.All.DnaOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DnaOff: ImageVector
    @Composable get() = DnaOffDefinition.asImageVector()
